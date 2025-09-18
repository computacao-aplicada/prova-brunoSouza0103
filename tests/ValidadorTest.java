import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorTest {

    //Válido (com máscara)
    @Test
    void ValidarCPFValidoComMascara() {
        assertTrue(Validador.validarCPF("529.982.247-25"));
    }

    //Válido (sem máscara)
    @Test
    void ValidarCPFValidoSemMascara() {
        assertTrue(Validador.validarCPF("52998224725"));
    }

    //Espaços externos
    @Test
    void ValidarCPFComEspacosExternos() {
        assertTrue(Validador.validarCPF(" 529.982.247-25 "));
    }

    //Nulo
    @Test
    void RejeitarCPFNulo() {
        assertFalse(Validador.validarCPF(null));
    }

    //Vazio
    @Test
    void RejeitarCPFVazio() {
        assertFalse(Validador.validarCPF(""));
    }

    //Caractere inválido
    @Test
    void RejeitarCPFComCaractereInvalido() {
        assertFalse(Validador.validarCPF("529.982.247-2X"));
    }

    //Sequência repetida
    @Test
    void RejeitarCPFComSequenciaRepetida() {
        assertFalse(Validador.validarCPF("000.000.000-00"));
    }

    //Tamanho menor - 10 dígitos
    @Test
    void RejeitarCPFComTamanhoMenor() {
        assertFalse(Validador.validarCPF("935.411.347-8"));
    }

    //Tamanho maior - 12 dígitos
    @Test
    void RejeitarCPFComTamanhoMaior() {
        assertFalse(Validador.validarCPF("935.411.347-800")); // 12 dígitos
    }

    //DV incorreto
    @Test
    void RejeitarDVIncorreto() {
        assertFalse(Validador.validarCPF("529.982.247-24"));
    }

    //DV incorreto (genérico)
    @Test
    void RejeitarDVGenerico(){
        assertFalse(Validador.validarCPF("123.456.789-00"));
    }

}


