package ej01;

public class Empleado {

	private String dni, nombre, apellidos;
	private double salario;
	private static String empresa;
	private static double IVA;

	static {
		setEmpresa("ACME");
		setIVA(0.21);
	}

	public Empleado(String dni, String nombre, String apellidos, double salario) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salario = salario;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public static String getEmpresa() {
		return empresa;
	}

	public static void setEmpresa(String empresa) {
		Empleado.empresa = empresa;
	}

	public static double getIVA() {
		return IVA;
	}

	public static void setIVA(double IVA) {
		Empleado.IVA = IVA;
	}
}
