package br.com.teste.agenda;

import android.widget.EditText;
import android.widget.RatingBar;

import br.com.teste.agenda.modelo.Aluno;

public class FormularioHelper {

    private final EditText campoNome;
    private final EditText campoEndereco;
    private final EditText campoTelefone;
    private final EditText campoSite;
    private final RatingBar campoNota;

    private Aluno aluno;


    public FormularioHelper(FormularioActivity activity){
         campoNome = (EditText) activity.findViewById(R.id.formulario_nome);
         campoEndereco = (EditText) activity.findViewById(R.id.formulario_endereco);
         campoTelefone = (EditText) activity.findViewById(R.id.formulario_telefone);
         campoSite = (EditText) activity.findViewById(R.id.formulario_site);
         campoNota = (RatingBar) activity.findViewById(R.id.formulario_nota);

         aluno = new Aluno();

    }

    public Aluno pegaAluno() {
        aluno.setNome(campoNome.getText().toString());
        aluno.setEndereco(campoEndereco.getText().toString());
        aluno.setTelefone(campoTelefone.getText().toString());
        aluno.setSite(campoSite.getText().toString());
        aluno.setNota(Double.valueOf(campoNota.getProgress()));
        return aluno;
    }

    public void preencheFormulario(Aluno aluno) {
        campoNome.setText(aluno.getNome());
        campoEndereco.setText(aluno.getEndereco());
        campoSite.setText(aluno.getSite());
        campoTelefone.setText(aluno.getTelefone());
        campoNota.setProgress(aluno.getNota().intValue());

        this.aluno = aluno;
    }
}
