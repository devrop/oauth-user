package ropandi.user.service;

import ropandi.oauth.ClientModel;

public interface IClientService {

	public ClientModel loadByClientId(String username);
}
