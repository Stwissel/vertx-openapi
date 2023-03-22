/*
 * Copyright 2023 Red Hat, Inc.
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  and Apache License v2.0 which accompanies this distribution.
 *
 *  The Eclipse Public License is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  The Apache License v2.0 is available at
 *  http://www.opensource.org/licenses/apache2.0.php
 *
 *  You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.openapi.contract;

import io.vertx.codegen.annotations.Nullable;
import io.vertx.codegen.annotations.VertxGen;

/**
 * Represents a Security Scheme Object.
 */
@VertxGen
public interface SecurityScheme extends OpenAPIObject {

  /**
   * The type of the security scheme. Valid values are "apiKey", "http", "mutualTLS", "oauth2", "openIdConnect"
   */
  String getType();

  /**
   * The name of the header, query or cookie parameter to be used.
   */
  String getName();

  /**
   * The location of the API key. Valid values are "query", "header" or "cookie".
   */
  String getIn();

  /**
   * The name of the HTTP Authorization scheme to be used in the Authorization header as defined in [RFC7235].
   * The values used SHOULD be registered in the IANA Authentication Scheme registry.
   */
  String getScheme();

  /**
   * A hint to the client to identify how the bearer token is formatted.
   * Bearer tokens are usually generated by an authorization server, so this information is primarily for
   * documentation purposes.
   */
  String getBearerFormat();

  /**
   *  An object containing configuration information for the flow types supported.
   */
  @Nullable OAuthFlows getFlows();

  /**
   * OpenId Connect URL to discover OAuth2 configuration values. This MUST be in the form of a URL.
   * The OpenID Connect standard requires the use of TLS.
   */
  String getOpenIdConnectUrl();
}
