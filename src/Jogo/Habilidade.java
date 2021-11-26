package Jogo;

	public class Habilidade {
	
		private String nomeHabilidadePerso;
		private Boolean statusHabPerso;
		private int idHab;
		private String descricaoHab;
		
			public Habilidade() {
				
			}
			
			
			public String getDescricaoHab() {
				return descricaoHab;
			}
		
			public void setDescricaoHab(String descricaoHab) {
				this.descricaoHab = descricaoHab;
			}
		
		
			public String getNomeHabilidadePerso() {
				return nomeHabilidadePerso;
			}
			public void setNomeHabilidadePerso(String nomeHabilidadePerso) {
				this.nomeHabilidadePerso = nomeHabilidadePerso;
			}
			public Boolean getStatusHabPerso() {
				return statusHabPerso;
			}
			public void setStatusHabPerso(Boolean statusHabPerso) {
				this.statusHabPerso = statusHabPerso;
			}
			public int getIdHab() {
				return idHab;
			}
			public void setIdHab(int idHab) {
				this.idHab = idHab;
			}

	
	
}
