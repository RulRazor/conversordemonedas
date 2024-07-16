package com.aluradesafio.conversordemonedas.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosMoneda(
   @JsonAlias("base_code")String monedaBase,
   @JsonAlias("target_code")String monedaDestino,
   @JsonAlias("conversion_rate")float conversion
) {}
