package br.com.azabraao.cative_tela_de_missao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText objetivo;
    EditText descricao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        descricao = findViewById(R.id.descricao);
        objetivo = findViewById(R.id.objetivo);
    }

    public void salvaMissao(View view) {
        String descInputValue = descricao.getText().toString();
        String objInputValue = objetivo.getText().toString();

        Toast.makeText(this, descInputValue, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, objInputValue, Toast.LENGTH_SHORT).show();
    }
}
