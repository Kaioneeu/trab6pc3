package br.edu.prog3.trab6.persistence;

public class Teste {

	public static void main(String[] args) {
		AlunoDAO aDAO = new AlunoDAOImp();
		// Aluno a = new Aluno(7, "João Testão", "Asa Sul");
		// System.out.println(aDAO.delete(7));

		// List<Aluno> al = aDAO.list();
		// for (Aluno aluno : al) {
		// System.out.println(aluno);
		// }

		System.out.println(aDAO.findByMatricula(6));
	}

}
