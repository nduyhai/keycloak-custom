package com.inventage.keycloak.passkey.infrastructure.authenticator;

import org.jboss.logging.Logger;
import org.keycloak.authentication.AuthenticationFlowContext;
import org.keycloak.authentication.Authenticator;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.RealmModel;
import org.keycloak.models.UserModel;

public class PasskeyAuthenticator implements Authenticator {
  private static final Logger LOG = Logger.getLogger(PasskeyAuthenticator.class);

  @Override
  public void authenticate(AuthenticationFlowContext authenticationFlowContext) {
    LOG.debugf("[passkey] authenticate");
    authenticationFlowContext.success();
  }

  @Override
  public void action(AuthenticationFlowContext authenticationFlowContext) {
    LOG.debugf("[passkey] action");
    authenticationFlowContext.success();
  }

  @Override
  public boolean requiresUser() {
    LOG.debugf("[passkey] requiresUser");
    return false;
  }

  @Override
  public boolean configuredFor(
      KeycloakSession keycloakSession, RealmModel realmModel, UserModel userModel) {
    LOG.debugf("[passkey] configuredFor");

    return false;
  }

  @Override
  public void setRequiredActions(
      KeycloakSession keycloakSession, RealmModel realmModel, UserModel userModel) {
    LOG.debugf("[passkey] setRequiredActions");
  }

  @Override
  public void close() {
    LOG.debugf("[passkey] close");
  }
}
