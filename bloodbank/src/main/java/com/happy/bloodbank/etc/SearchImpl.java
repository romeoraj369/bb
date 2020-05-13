package com.happy.bloodbank.etc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.happy.bloodbank.entity.AccountDetails;
import com.happy.bloodbank.entity.BloodDetails;
import com.happy.bloodbank.entity.PersonDetails;
import com.happy.bloodbank.service.BloodService;
import com.happy.bloodbank.service.PersonService;
@Service
public class SearchImpl {
	
	@Autowired
	private BloodService bs;
	@Autowired
	private PersonService ps;


	int ii;
	AccountDetails pi;
	String name;
	BloodDetails bd;
	PersonDetails pp;
	

	public List<Search> getPrsn(String city, String bg){
		List<Search> lis = new ArrayList<Search>();
		List<BloodDetails> brs = bs.getall();
		for(int i=0;i<brs.size(); i++) {
			BloodDetails bp = brs.get(i);
			if(bg.equals(bp.getBlood_Group())) { 
			  ii=bp.getBg_id();
			List<PersonDetails> prs = ps.getall();
			for(int j=0 ; j<prs.size(); j++) {
				PersonDetails pd = prs.get(j);
				BloodDetails id=pd.getBG_FK();
				if(ii==id.getBg_id()) { 
					if(city.equals(pd.getCity())) {
					pi=pd.getAccount_fk();
					name=pd.getFirst_name();
					String ph = pi.getPhone();
					Search s = new Search();
					s.setName(name);
					s.setPhone(ph);
				   lis.add(s);
			  
				} 
				}
			}
			
			}
			
		}
		
		return lis;
	}
	
}