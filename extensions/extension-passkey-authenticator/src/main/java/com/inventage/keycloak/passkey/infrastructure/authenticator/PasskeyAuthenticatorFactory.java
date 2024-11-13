package com.inventage.keycloak.passkey.infrastructure.authenticator;

import com.google.auto.service.AutoService;
import java.util.Collections;
import java.util.List;
import org.keycloak.Config.Scope;
import org.keycloak.authentication.Authenticator;
import org.keycloak.authentication.AuthenticatorFactory;
import org.keycloak.models.AuthenticationExecutionModel;
import org.keycloak.models.AuthenticationExecutionModel.Requirement;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;
import org.keycloak.provider.ProviderConfigProperty;

@AutoService(org.keycloak.authentication.AuthenticatorFactory.class)
public class PasskeyAuthenticatorFactory implements AuthenticatorFactory {

  private static final String PROVIDER_ID = "passkey-authenticator";
  private static final AuthenticationExecutionModel.Requirement[] REQUIREMENT_CHOICES = {
    AuthenticationExecutionModel.Requirement.REQUIRED,
    AuthenticationExecutionModel.Requirement.ALTERNATIVE,
    AuthenticationExecutionModel.Requirement.CONDITIONAL,
    AuthenticationExecutionModel.Requirement.DISABLED
  };

  @Override
  public String getDisplayType() {
    return "Passkey authenticator";
  }

  @Override
  public String getReferenceCategory() {
    return null;
  }

  @Override
  public boolean isConfigurable() {
    return false;
  }

  @Override
  public Requirement[] getRequirementChoices() {
    return REQUIREMENT_CHOICES;
  }

  @Override
  public boolean isUserSetupAllowed() {
    return false;
  }

  @Override
  public String getHelpText() {
    return "This Authenticator support passkey";
  }

  @Override
  public List<ProviderConfigProperty> getConfigProperties() {
    return Collections.emptyList();
  }

  @Override
  public Authenticator create(KeycloakSession keycloakSession) {
    return new PasskeyAuthenticator();
  }

  @Override
  public void init(Scope scope) {
    // NOP
  }

  @Override
  public void postInit(KeycloakSessionFactory keycloakSessionFactory) {
    // NOP
  }

  @Override
  public void close() {
    // NOP
  }

  @Override
  public String getId() {
    return PROVIDER_ID;
  }
}
