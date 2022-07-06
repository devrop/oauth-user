package ropandi.user.service.impl;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import ropandi.user.entity.MstOauthCredential;
import ropandi.user.model.CredentialData;
import ropandi.user.model.CredentialRequest;
import ropandi.user.model.ScopeData;
import ropandi.user.repository.CredentialRepository;
import ropandi.user.service.ICredentialService;
@Service
@Transactional
public class CredentailService implements ICredentialService {

	@Autowired
	private CredentialRepository credentialRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public CredentialData loadByUsername(String username) {
		// TODO Auto-generated method stub
		Optional<MstOauthCredential> opt = credentialRepository.findById(username);
		if(opt.isPresent()){
			
			MstOauthCredential c = opt.get();
			Set<ScopeData> list = new HashSet<>();
			if(c.getScope() !=null){
				final String[] scopes = c.getScope().split(",");
				int index = 0;
				for(String v : scopes){
					list.add(ScopeData.builder().id(index).value(v).build());
					index++;
				}
				
			}
			return CredentialData
					.builder()
					.username(c.getUsername())
					.password(c.getPassword())
					.scopes(list)
					.build();

		}
		
		return null;
		
				
		 
	}

	@Override
	public int save(CredentialRequest data) {
		// TODO Auto-generated method stub
		try{
			credentialRepository
			.save(MstOauthCredential
					.builder()
					.username(data.getUsername())
					.password(passwordEncoder.encode(data.getPassword()))
					.scope(data.getScopes())
					.build()
					);
			

			return 1;
		}catch(Exception e){
		

			return 0;
		}
		
		
	}

}
