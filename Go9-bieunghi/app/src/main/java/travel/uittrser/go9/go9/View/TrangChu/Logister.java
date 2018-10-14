package travel.uittrser.go9.go9.View.TrangChu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import travel.uittrser.go9.go9.R;

public class Logister extends AppCompatActivity {
    public Button btlogis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logister);
        btlogis= (Button) findViewById(R.id.btn_logister);
        btlogis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Logister.this, Login.class);
                startActivity(in);
            }
        });
    }
}
