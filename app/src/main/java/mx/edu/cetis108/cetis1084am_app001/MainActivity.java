package mx.edu.cetis108.cetis1084am_app001;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnSaludar_click(View v)
    {
        TextView lblMensaje=(TextView)findViewById(R.id.lblMensaje);
        EditText txtNombre=(EditText) findViewById(R.id.txtNombre);
        lblMensaje.setText("Hola "+txtNombre.getText());
        InputMethodManager inputMethodManager=(InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(txtNombre.getWindowToken(), 0);
    }
}
