package ibm.tf.hangul;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class menu_writing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_writing);
    }

    //level 1 writing
    public void onClickButton11(View v){
        Intent intent = new Intent(this,WritingActivity.class);
        intent.putExtra("level",1);
        startActivity(intent);

    }

    //level2 writing
    public void onClickButton12(View v){
        Intent intent = new Intent(this,WritingActivity.class);
        intent.putExtra("level",2);
        startActivity(intent);
    }

    //level3 writing
    public void onClickButton13(View v){
        Intent intent = new Intent(this,WritingActivity.class);
        intent.putExtra("level",3);
        startActivity(intent);

    }
}
