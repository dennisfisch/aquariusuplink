package de.dennisfisch.aquariusuplink.controller;

import de.dennisfisch.aquariusuplink.model.uplink.Category;
import de.dennisfisch.aquariusuplink.model.uplink.Notification;
import de.dennisfisch.aquariusuplink.model.uplink.Page;
import de.dennisfisch.aquariusuplink.model.uplink.System;
import de.dennisfisch.aquariusuplink.model.uplink.SystemConfig;
import de.dennisfisch.aquariusuplink.model.uplink.SystemUnit;
import de.dennisfisch.aquariusuplink.service.rest.ParameterDecoder;
import de.dennisfisch.aquariusuplink.service.uplink.CategoryProvider;
import de.dennisfisch.aquariusuplink.service.uplink.ConfigProvider;
import de.dennisfisch.aquariusuplink.service.uplink.NotificationProvider;
import de.dennisfisch.aquariusuplink.service.uplink.ParameterService;
import de.dennisfisch.aquariusuplink.service.uplink.StatusProvider;
import de.dennisfisch.aquariusuplink.service.uplink.SystemProvider;
import de.dennisfisch.aquariusuplink.service.uplink.UnitProvider;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class UplinkController {

	private final SystemProvider systemProvider;

	private final CategoryProvider categoryProvider;

	private final ConfigProvider configProvider;

	private final NotificationProvider notificationProvider;

	private final ParameterService parameterService;

	private final StatusProvider statusProvider;

	private final UnitProvider unitProvider;

	private final ParameterDecoder parameterDecoder;

	@GetMapping(value = "/systems", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<System> provideSystems() {
		return systemProvider.provideSystems().getObjects();
	}

	@GetMapping("/systems/{systemId}")
	public System provideSystem(@PathVariable final int systemId) {
		return systemProvider.provideSystem(systemId);
	}

	@GetMapping("/systems/{systemId}/config")
	public SystemConfig provideConfig(@PathVariable final int systemId) {
		return configProvider.provideConfig(systemId);
	}

	@GetMapping("/systems/{systemId}/notifications")
	public Page<Notification> provideNotifications(@PathVariable final int systemId) {
		return notificationProvider.provideNotifications(systemId);
	}

	@GetMapping("/systems/{systemId}/units")
	public List<SystemUnit> provideUnits(@PathVariable final int systemId) {
		return unitProvider.provideUnits(systemId);
	}

	@GetMapping("/systems/{systemId}/units/{systemUnitId}/categories")
	public List<Category> provideCategories(@PathVariable final int systemId, @PathVariable final int systemUnitId) {
		return categoryProvider.provideCategories(systemId, systemUnitId);
	}

	@GetMapping("/authorized")		// registered redirect_uri for authorization_code
	public String authorized(Model model) {
		model.addAttribute("messages", "messages");
		return "index";
	}
}