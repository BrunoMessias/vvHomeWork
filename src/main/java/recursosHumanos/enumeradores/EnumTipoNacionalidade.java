package recursosHumanos.enumeradores;

public enum EnumTipoNacionalidade implements Enumerador{
	BRASILEIRA("B","Brasileira"),
	ESTRANGEIRA("E","Estrangeira");

	/**
	 * Valor abreviado.
	 */
	private final String abreviado;
	/**
	 * Descrição do valor.
	 */
	private final String descricao;

	/**
	 * Construtor parametrizado com o valor abreviado e a descrição.
	 * @param abreviado
	 * @param descricao
	 */
	private EnumTipoNacionalidade(String abreviado, String descricao) {
		this.abreviado = abreviado;
		this.descricao = descricao;
		EnumUtilities.setEnumName(this, this.abreviado);
	}

	/**
	 * Método que retorna o valor abreviado do atributo.
	 * @return
	 * O valor abreviado do atributo
	 */
	public String getAbreviado() {
		return abreviado;
	}
	/**
	 * Método que retorna a descrição do atributo.
	 * @return
	 * A descrição do atributo
	 */

	public String getDescricao() {
		return descricao;
	}
}
