package apothiki.api;

public interface DatabaseFarmako {

	Farmako[] getAllFarmako();
	Farmako[] getFarmakobyname(String Name);
	Farmako[] getFarmakobydrastiki(String drastiki);
	Farmako[] getFarmakobyATC(String ATC);
	Farmako getFarmako(int id);	
}
