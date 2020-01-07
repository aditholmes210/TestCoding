public class No3{
	public static void print(Object obj){
			System.out.println(obj);
		}
	public static void main(String[] args){
		double gaji = 4600897;
		double anak = 4;
		double tunSpouse = gaji * 0.1;
		double tunAnak = anak * (0.02 * gaji);
		double bruto = gaji + tunSpouse + tunAnak;
		double pensiun = 0.04 * gaji;
		double netto = bruto - pensiun;
		
		print("\nGaji Pokok/Bulan        = Rp."+Math.round(gaji));
		print("Tunjangan Suami/Istri   = Rp."+Math.round(tunSpouse));
		print("Tunjangan Anak          = Rp."+Math.round(tunAnak));
		print("===========================");
		print("Penghasilan Bruto/Bulan = Rp."+Math.round(bruto));
		print("===========================");
		print("Pengurangan");
		print("Iuran Pensiun           = Rp."+Math.round(pensiun));
		print("===========================");
		print("Penghasilan Netto/Bulan = Rp."+Math.round(netto));	
	}
}