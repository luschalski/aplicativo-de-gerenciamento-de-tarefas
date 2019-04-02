
import javafx.animation.Animation.Status;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UniCesumar
 */
public class Tarefa {
    int id;
    String descricao;
    String dataCriacao;
    Status situacao;
    String responsavel;
    float horasEstimadas;
}

public enum Status{
    NAO_INICIADO,
    EM_PROGRESSO,
    TERMINADA,
    BLOQUEADA;
}

public class Tarefa{
    NAO_INICIADO,
    EM_PROGRESSO,
    TERMINADA,
    BLOQUEADA;
}

private Status status;

status = Status.TERMINADA;

Tarefa.Status.TERMINADA