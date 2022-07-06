package ropandi.user.service.impl;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ropandi.oauth.ClientModel;
import ropandi.user.entity.MstOauthClient;
import ropandi.user.repository.ClientRepository;
import ropandi.user.service.IClientService;

@Service
public class ClientService implements IClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	@Override
	public ClientModel loadByClientId(String clientId) {
		// TODO Auto-generated method stub
		System.out.println("Start here");
		MstOauthClient client = clientRepository.findByClientId(clientId).get();
		Set<String> authorities = client
				.getTrxClientAuthorityList().stream().map(s-> s.getAuthorityValue())
				.collect(Collectors.toSet());
		Set<String> scopes = client.getTrxClientScopeList().stream().map(d -> d.getScopeValue())
				.collect(Collectors.toSet());
		Set<String> authorizedGrantTypes = client.getTrxClientAuthGrantTypeList().stream()
				.map(f-> f.getGrantTypeValue())
				.collect(Collectors.toSet());
		boolean secretRequired = client.getSecretRequired() == 1? true : false;
		boolean scoped = client.getScoped() ==1? true : false;
		return ClientModel
				.builder()
				.id(Long.toString(client.getId()))
				.clientId(clientId)
				.clientSecret(client.getClientSecret())
				.secretRequired(secretRequired)
				.scoped(scoped)
				.scopes(scopes)
				.authorities(authorities)
				.authorizedGrantTypes(authorizedGrantTypes)
				.accessTokenValiditySeconds(client.getAccessTokenValidity())
				.refreshTokenValiditySeconds(client.getRefreshTokenValidity())
				.autoApprove(true)
				.build();
	}

}
