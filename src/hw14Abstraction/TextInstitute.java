package hw14Abstraction;

public class TextInstitute {

	public static void main(String[] args) {

		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
		
		columbiaUniversity.biology();
		columbiaUniversity.emergencyRoom();
		columbiaUniversity.surgeryRoom();
		columbiaUniversity.cafeteria();
		columbiaUniversity.lawInfo();
		columbiaUniversity.aeronauticalInfo();
		columbiaUniversity.vocationalInfo();
		columbiaUniversity.classSize();
		columbiaUniversity.playGround();
		columbiaUniversity.teacher();
		columbiaUniversity.biochemistryLab();
		columbiaUniversity.hygiene();
		columbiaUniversity.computerLab();
		columbiaUniversity.anatomyLab();
		columbiaUniversity.caring();
		columbiaUniversity.math();
		columbiaUniversity.mechanicalLab();
		columbiaUniversity.anthropology();
		columbiaUniversity.morgue();

		// University.university = new University(); // We can't call method from Interface using object in a regular class.
		

		// MedicalSchool.medicalSchool = new MedicalSchool(); // We can't call method from Abstract class using object in a regular class.
		

	}
}
