package org.jinooworld.rushhour;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    public static final int REQUEST_CODE_Beginner1 = 101;

    // 뒤로가기 버튼을 누르면 아무반응 x
    @Override
    public void onBackPressed() {
    }

    public void startOnClicked(View v){
        Intent start = new Intent(getApplicationContext(), Beginner1Activity.class);
        startActivityForResult(start, REQUEST_CODE_Beginner1);
    }

    public void rankOnClicked(View v){
        Toast.makeText(this,"미구현..", Toast.LENGTH_LONG).show();

    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 게임 종료를 위한 버튼 end
        Button end = (Button) findViewById(R.id.end);

        // onClick 메소드를 이용해 버튼과 연결
        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishActivity(0);
                System.runFinalization();
                System.exit(0);
            }
        });


    }
}
