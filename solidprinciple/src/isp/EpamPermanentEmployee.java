package isp;

public class EpamPermanentEmployee implements BasicDetails, PFDetails {

	@Override
	public void updatePFDetails() {
		System.out.println("Update PF Details");
		

	}

	@Override
	public void updateBasicDetails() {
		System.out.println("Updated Basic Details");
	}

	

}
