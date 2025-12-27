public class CancerDiagnosis {
    
    public String determineTreatment(int stage) {
        switch (stage) {
            case 1:
                return "Surgery / Targeted Radiation";
            case 2:
            case 3:
                return "Chemotherapy and Surgery";
            case 4:
                return "Immunotherapy / Palliative Care";
            default:
                return "Invalid Stage Provided";
        }
    }

    public static void main(String[] args) {
        CancerDiagnosis patientA = new CancerDiagnosis();
        System.out.println(patientA.determineTreatment(3));
    }
}
