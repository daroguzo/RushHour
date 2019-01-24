package org.jinooworld.rushhour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Expert1 extends AppCompatActivity {

    // 이동 횟수을 보여주는 변수
    TextView count;
    // 다시하기 버튼
    Button retry;
    // 횟수 저장용 변수
    int c = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expert1);

        // 레이아웃에 정의된 횟수 변수 객체 참조
        count = (TextView) findViewById(R.id.count);
        // 처음으로 횟수 보여주기
        count.setText("Move: " + c);

        // 다시하기 버튼 객체 참조
        retry = (Button) findViewById(R.id.retry);
        // retry 버튼 구현
        retry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recreate();
            }
        });

        // 게임 시작 시 보여주는 토스트 메세지
        Toast.makeText(this, "Advanced1 Start!" , Toast.LENGTH_LONG).show();

        // 포기 버튼을 누르면 메뉴화면으로 복귀
        Button fail = (Button) findViewById(R.id.fail);
        fail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goMenu = new Intent();
                goMenu.putExtra("message", "Give Up!");
                setResult(RESULT_OK, goMenu);

                finish();
            }
        });
    }


    // 자동차를 우로 한칸 움직이는 메소드
    void moveRight(ImageView car){

        car.setX(car.getX() + 156);
    }

    // 자동차를 좌로 한칸 움직이는 메소드
    void moveLeft(ImageView car){

        car.setX(car.getX() - 156);
    }

    // 자동차를 위로 한칸 움직이는 메소드
    void moveUp(ImageView car){

        car.setY(car.getY() - 150);
    }

    // 자동차를 아래로 한칸 움직이는 메소드
    void moveDown(ImageView car){

        car.setY(car.getY() + 150);
    }

    // 12자동차가 X축 맵 왼쪽으로 나가지 않도록 검사하는 메소드
    boolean checkXInMapL(ImageView car){

        if(car.getX() > 0){
            return true;
        }else{
            return false;
        }
    }
    // 12자동차가 X축 맵 오른쪽으로 나가지 않도록 검사하는 메소드
    boolean checkXInMapR(ImageView car){

        if(car.getX() < 700){
            return true;
        }else{
            return false;
        }
    }

    // 13자동차가 X축 맵 왼쪽으로 나가지 않도록 검사하는 메소드
    boolean checkXInMapL2(ImageView car){

        if(car.getX() > 100){
            return true;
        }else{
            return false;
        }
    }
    // 13자동차가 X축 맵 오른쪽으로 나가지 않도록 검사하는 메소드
    boolean checkXInMapR2(ImageView car){

        if(car.getX() < 600){
            return true;
        }else{
            return false;
        }
    }

    // 21자동차가 Y축 맵 위로 나가지 않도록 검사하는 메소드
    boolean checkYInMapU(ImageView car){

        if(car.getY() > 0){
            return true;
        }else{
            return false;
        }
    }

    // 21자동차가 Y축 맵 아래로 나가지 않도록 검사하는 메소드
    boolean checkYInMapD(ImageView car){

        if(car.getY() < 600){
            return true;
        }else{
            return false;
        }
    }

    // 31자동차가 Y축 맵 위로 나가지 않도록 검사하는 메소드
    boolean checkYInMapU2(ImageView car){

        if(car.getY() > 100){
            return true;
        }else{
            return false;
        }
    }

    // 31자동차가 Y축 맵 아래로 나가지 않도록 검사하는 메소드
    boolean checkYInMapD2(ImageView car){

        if(car.getY() < 600){
            return true;
        }else{
            return false;
        }
    }
}
