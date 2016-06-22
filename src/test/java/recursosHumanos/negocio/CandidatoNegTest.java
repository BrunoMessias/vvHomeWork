package recursosHumanos.negocio;

import org.junit.Test;
import recursosHumanos.entidade.Candidato;
import recursosHumanos.entidade.Cargo;
import recursosHumanos.enumeradores.EnumSexo;
import recursosHumanos.enumeradores.EnumTipoDocumentoHabilitacao;
import recursosHumanos.enumeradores.EnumTipoDocumentoPessoal;
import recursosHumanos.enumeradores.EnumTipoNacionalidade;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by Bruno Messias on 15/06/2016.
 */
public class CandidatoNegTest {
    @Test
    public void validaNome1() throws Exception {
        Cargo cargo = new Cargo("Estudante", 900.00, EnumTipoDocumentoHabilitacao.CNH, 35);
        Candidato candidato = new Candidato("Pedro de Alcântara João Carlos Leopoldo Salvador Bibiano Francisco Xavier de Paula Leocádio Miguel Gabriel Rafael Gonzaga de Bragança e Bourbon", new Date(1,1,1990), EnumSexo.M, EnumTipoNacionalidade.BRASILEIRA, EnumTipoDocumentoPessoal.CPF, "7686313618", "32645185630", "", "7378368");
        CandidatoNeg candidatoNeg = new CandidatoNeg();
        assertFalse(candidatoNeg.validaNome(candidato));
    }

    @Test
    public void validaNome2() throws Exception {
        Cargo cargo = new Cargo(null, 900.00, EnumTipoDocumentoHabilitacao.CNH, 35);
        Candidato candidato = new Candidato("Jean Marcos", new Date(1,1,1990), EnumSexo.M, EnumTipoNacionalidade.BRASILEIRA, EnumTipoDocumentoPessoal.CPF, "7686313618", "32645185630", "", "7378368");
        CandidatoNeg candidatoNeg = new CandidatoNeg();
        candidatoNeg.validaNome(candidato);
        assertFalse(candidatoNeg.validaNome(candidato));
    }
    @Test
    public void validaNome3() throws Exception {
        Cargo cargo = new Cargo("", 900.00, EnumTipoDocumentoHabilitacao.CNH, 35);
        Candidato candidato = new Candidato("Jean Marcos", new Date(1,1,1990), EnumSexo.M, EnumTipoNacionalidade.BRASILEIRA, EnumTipoDocumentoPessoal.CPF, "7686313618", "32645185630", "", "7378368");
        CandidatoNeg candidatoNeg = new CandidatoNeg();
        candidatoNeg.validaNome(candidato);
        assertFalse(candidatoNeg.validaNome(candidato));
    }
    @Test
    public void validaNome4() throws Exception {
        Cargo cargo = new Cargo("0a51", 900.00, EnumTipoDocumentoHabilitacao.CNH, 35);
        Candidato candidato = new Candidato("Jean Marcos", new Date(1,1,1990), EnumSexo.M, EnumTipoNacionalidade.BRASILEIRA, EnumTipoDocumentoPessoal.CPF, "7686313618", "32645185630", "", "7378368");
        CandidatoNeg candidatoNeg = new CandidatoNeg();
        candidatoNeg.validaNome(candidato);
        assertFalse(candidatoNeg.validaNome(candidato));
    }
    @Test
    public void validaNome5() throws Exception {
        Cargo cargo = new Cargo("José_Pedro", 900.00, EnumTipoDocumentoHabilitacao.CNH, 35);
        Candidato candidato = new Candidato("Jean Marcos", new Date(1,1,1990), EnumSexo.M, EnumTipoNacionalidade.BRASILEIRA, EnumTipoDocumentoPessoal.CPF, "7686313618", "32645185630", "", "7378368");
        CandidatoNeg candidatoNeg = new CandidatoNeg();
        candidatoNeg.validaNome(candidato);
        assertFalse(candidatoNeg.validaNome(candidato));
    }

    @Test
    public void validaDataNascimento() throws Exception {

    }

    @Test
    public void validarCPF() throws Exception {

    }

    @Test
    public void validaIdade() throws Exception {

    }

    @Test
    public void validaPassaporte() throws Exception {

    }

    @Test
    public void validaSexo() throws Exception {

    }

    @Test
    public void validaNecessidadeReservista() throws Exception {

    }

    @Test
    public void validaDocumentoReservista() throws Exception {

    }

    @Test
    public void validaCandidato() throws Exception {

    }

}