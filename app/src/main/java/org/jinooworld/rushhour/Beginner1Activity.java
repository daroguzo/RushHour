package org.jinooworld.rushhour;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Beginner1Activity extends AppCompatActivity {

    // 이동 횟수을 보여주는 변수
    TextView count;
    // 다시하기 버튼
    Button retry;
    // 횟수 저장용 변수
    int c = 0;

    // 뒤로가기 버튼을 누르면 아무반응 x
    @Override
    public void onBackPressed() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner1);



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
        Toast.makeText(this, "Beginner1 Start!" , Toast.LENGTH_LONG).show();

        final Intent goAdvanced1 = new Intent(this, Advanced1Activity.class);



        // 포기 버튼을 누르면 메뉴화면으로 복귀
        Button fail = (Button) findViewById(R.id.fail);
        fail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Give Up!", Toast.LENGTH_LONG).show();
                Beginner1Activity.this.finish();
            }
        });

        // 자동차 객체 참조
        final ImageView player_1 = (ImageView) findViewById(R.id.player_1);
        final ImageView player_2 = (ImageView) findViewById(R.id.player_2);
        final ImageView car12_1 = (ImageView) findViewById(R.id.car12_1);
        final ImageView car12_2 = (ImageView) findViewById(R.id.car12_2);
        final ImageView car12_2_1 = (ImageView) findViewById(R.id.car12_2_1);
        final ImageView car12_2_2 = (ImageView) findViewById(R.id.car12_2_2);
        final ImageView car31_1 = (ImageView) findViewById(R.id.car31_1);
        final ImageView car31_2 = (ImageView) findViewById(R.id.car31_2);
        final ImageView car31_2_1 = (ImageView) findViewById(R.id.car31_2_1);
        final ImageView car31_2_2 = (ImageView) findViewById(R.id.car31_2_2);
        final ImageView car31_3_1 = (ImageView) findViewById(R.id.car31_3_1);
        final ImageView car31_3_2 = (ImageView) findViewById(R.id.car31_3_2);
        final ImageView car21_1 = (ImageView) findViewById(R.id.car21_1);
        final ImageView car21_2 = (ImageView) findViewById(R.id.car21_2);
        final ImageView car13_1 = (ImageView) findViewById(R.id.car13_1);
        final ImageView car13_2 = (ImageView) findViewById(R.id.car13_2);

        // 자동차 이미지뷰들의 Layout 속성값 참조
        final RelativeLayout.LayoutParams player_1LayoutParams = (RelativeLayout.LayoutParams) player_1.getLayoutParams();
        final RelativeLayout.LayoutParams player_2LayoutParams = (RelativeLayout.LayoutParams) player_2.getLayoutParams();
        final RelativeLayout.LayoutParams car12_1LayoutParams = (RelativeLayout.LayoutParams) car12_1.getLayoutParams();
        final RelativeLayout.LayoutParams car12_2LayoutParams = (RelativeLayout.LayoutParams) car12_2.getLayoutParams();
        final RelativeLayout.LayoutParams car31_1LayoutParams = (RelativeLayout.LayoutParams) car31_1.getLayoutParams();
        final RelativeLayout.LayoutParams car31_2LayoutParams = (RelativeLayout.LayoutParams) car31_2.getLayoutParams();
        final RelativeLayout.LayoutParams car31_2_1LayoutParams = (RelativeLayout.LayoutParams) car31_2_1.getLayoutParams();
        final RelativeLayout.LayoutParams car31_2_2LayoutParams = (RelativeLayout.LayoutParams) car31_2_2.getLayoutParams();
        final RelativeLayout.LayoutParams car31_3_1LayoutParams = (RelativeLayout.LayoutParams) car31_3_1.getLayoutParams();
        final RelativeLayout.LayoutParams car31_3_2LayoutParams = (RelativeLayout.LayoutParams) car31_3_2.getLayoutParams();
        final RelativeLayout.LayoutParams car12_2_1LayoutParams = (RelativeLayout.LayoutParams) car12_2_1.getLayoutParams();
        final RelativeLayout.LayoutParams car12_2_2LayoutParams = (RelativeLayout.LayoutParams) car12_2_2.getLayoutParams();
        final RelativeLayout.LayoutParams car21_1LayoutParams = (RelativeLayout.LayoutParams) car21_1.getLayoutParams();
        final RelativeLayout.LayoutParams car21_2LayoutParams = (RelativeLayout.LayoutParams) car21_2.getLayoutParams();
        final RelativeLayout.LayoutParams car13_1LayoutParams = (RelativeLayout.LayoutParams) car13_1.getLayoutParams();
        final RelativeLayout.LayoutParams car13_2LayoutParams = (RelativeLayout.LayoutParams) car13_2.getLayoutParams();




        // player 이동
        player_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player_1LayoutParams.leftMargin >= 516) {
                    if (car31_2_1LayoutParams.topMargin >= 450) {
                        if (player_1LayoutParams.leftMargin > 156) {
                            moveLeft(player_1);
                            moveLeft(player_2);
                            player_1LayoutParams.leftMargin -= 156;
                            player_2LayoutParams.leftMargin -= 156;
                            // 움직이면 횟수 +1
                            count.setText("Move: " + ++c);
                        }
                    }
                }
                else {
                    if (player_1LayoutParams.leftMargin > 156) {
                        moveLeft(player_1);
                        moveLeft(player_2);
                        player_1LayoutParams.leftMargin -= 156;
                        player_2LayoutParams.leftMargin -= 156;
                        // 움직이면 횟수 +1
                        count.setText("Move: " + ++c);
                    }
                }
            }
        });
        player_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player_1LayoutParams.leftMargin == 156) {
                    if (car31_2_1LayoutParams.topMargin != 0 && car31_2_1LayoutParams.topMargin != 150 && car31_2_1LayoutParams.topMargin != 300) {
                        if (player_2.getX() < 800) {
                            moveRight(player_1);
                            moveRight(player_2);
                            player_1LayoutParams.leftMargin += 156;
                            player_2LayoutParams.leftMargin += 156;
                            // 움직이면 횟수 +1
                            count.setText("Move: " + ++c);
                        }
                    }
                }else if (player_1LayoutParams.leftMargin  >= 468){
                    if (car31_3_1LayoutParams.topMargin >= 450) {
                        if (player_2.getX() < 800) {
                            moveRight(player_1);
                            moveRight(player_2);
                            player_1LayoutParams.leftMargin += 156;
                            player_2LayoutParams.leftMargin += 156;
                            // 움직이면 횟수 +1
                            count.setText("Move: " + ++c);
                            if (player_2.getX() > 800) {
                                Toast.makeText(getApplicationContext(), "Score: " + c, Toast.LENGTH_LONG).show();
                                Beginner1Activity.this.finish();
                                startActivity(goAdvanced1);
                                //Beginner1Activity.this.finish();
                            }
                        }
                    }
                }else{
                    if (player_2.getX() < 800) {
                        moveRight(player_1);
                        moveRight(player_2);
                        player_1LayoutParams.leftMargin += 156;
                        player_2LayoutParams.leftMargin += 156;
                        // 움직이면 횟수 +1
                        count.setText("Move: " + ++c);
                        if (player_2.getX() > 800) {
                            // 클리어 시 행동
                            // 다음 으로 이동
                            Toast.makeText(getApplicationContext(), "Score: " + c, Toast.LENGTH_LONG).show();
                            startActivity(goAdvanced1);
                            Beginner1Activity.this.finish();
                        }
                    }
                }
            }
        });

        // car12 이동
        car12_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(car12_1LayoutParams.leftMargin == 156) {
                    if (car31_1LayoutParams.topMargin != 0) {
                        if (checkXInMapL(car12_1)) {
                            moveLeft(car12_1);
                            moveLeft(car12_2);
                            car12_1LayoutParams.leftMargin -= 156;
                            car12_2LayoutParams.leftMargin -= 156;
                            // 움직이면 횟수 +1
                            count.setText("Move: " + ++c);
                        }
                    }
                }else if(car12_1LayoutParams.leftMargin == 624){
                    if (car31_2_1LayoutParams.topMargin != 0) {
                        if (checkXInMapL(car12_1)) {
                            moveLeft(car12_1);
                            moveLeft(car12_2);
                            car12_1LayoutParams.leftMargin -= 156;
                            car12_2LayoutParams.leftMargin -= 156;
                            // 움직이면 횟수 +1
                            count.setText("Move: " + ++c);
                        }
                    }
                }else{
                    if (checkXInMapL(car12_1)) {
                        moveLeft(car12_1);
                        moveLeft(car12_2);
                        car12_1LayoutParams.leftMargin -= 156;
                        car12_2LayoutParams.leftMargin -= 156;
                        // 움직이면 횟수 +1
                        count.setText("Move: " + ++c);
                    }
                }
            }
        });
        car12_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(car12_1LayoutParams.leftMargin == 156) {
                    if (car31_2_1LayoutParams.topMargin != 0) {
                        if (checkXInMapR(car12_2)) {
                            moveRight(car12_1);
                            moveRight(car12_2);
                            car12_1LayoutParams.leftMargin += 156;
                            car12_2LayoutParams.leftMargin += 156;
                            // 움직이면 횟수 +1
                            count.setText("Move: " + ++c);
                        }
                    }
                }else if(car12_1LayoutParams.leftMargin == 468){
                    if (car31_3_1LayoutParams.topMargin != 0) {
                        if (checkXInMapR(car12_2)) {
                            moveRight(car12_1);
                            moveRight(car12_2);
                            car12_1LayoutParams.leftMargin += 156;
                            car12_2LayoutParams.leftMargin += 156;
                            // 움직이면 횟수 +1
                            count.setText("Move: " + ++c);
                        }
                    }
                }else{
                    if (checkXInMapR(car12_2)) {
                        moveRight(car12_1);
                        moveRight(car12_2);
                        car12_1LayoutParams.leftMargin += 156;
                        car12_2LayoutParams.leftMargin += 156;
                        // 움직이면 횟수 +1
                        count.setText("Move: " + ++c);
                    }
                }
            }
        });

        // car12_2 이동
        car12_2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(car12_2_1LayoutParams.leftMargin == 156) {
                    if (car21_1LayoutParams.topMargin <= 300) {
                        if (checkXInMapL(car12_2_1)) {
                            moveLeft(car12_2_1);
                            moveLeft(car12_2_2);
                            car12_2_1LayoutParams.leftMargin -= 156;
                            car12_2_2LayoutParams.leftMargin -= 156;
                            // 움직이면 횟수 +1
                            count.setText("Move: " + ++c);
                        }
                    }
                }else if(car12_2_1LayoutParams.leftMargin == 624){
                    if (car31_2_1LayoutParams.topMargin <= 150) {
                        if (checkXInMapL(car12_2_1)) {
                            moveLeft(car12_2_1);
                            moveLeft(car12_2_2);
                            car12_2_1LayoutParams.leftMargin -= 156;
                            car12_2_2LayoutParams.leftMargin -= 156;
                            // 움직이면 횟수 +1
                            count.setText("Move: " + ++c);
                        }
                    }
                }else {
                    if (checkXInMapL(car12_2_1)) {
                        moveLeft(car12_2_1);
                        moveLeft(car12_2_2);
                        car12_2_1LayoutParams.leftMargin -= 156;
                        car12_2_2LayoutParams.leftMargin -= 156;
                        // 움직이면 횟수 +1
                        count.setText("Move: " + ++c);
                    }
                }
            }
        });
        car12_2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(car12_2_1LayoutParams.leftMargin == 156) {
                    if (car31_2_1LayoutParams.topMargin <= 150) {
                        if (checkXInMapR(car12_2_2)) {
                            moveRight(car12_2_1);
                            moveRight(car12_2_2);
                            car12_2_1LayoutParams.leftMargin += 156;
                            car12_2_2LayoutParams.leftMargin += 156;
                            // 움직이면 횟수 +1
                            count.setText("Move: " + ++c);
                        }
                    }
                }else if(car12_2_1LayoutParams.leftMargin == 468){
                    if (car31_3_1LayoutParams.topMargin <= 150) {
                        if (checkXInMapR(car12_2_2)) {
                            moveRight(car12_2_1);
                            moveRight(car12_2_2);
                            car12_2_1LayoutParams.leftMargin += 156;
                            car12_2_2LayoutParams.leftMargin += 156;
                            // 움직이면 횟수 +1
                            count.setText("Move: " + ++c);
                        }
                    }
                }else {
                    if (checkXInMapR(car12_2_2)) {
                        moveRight(car12_2_1);
                        moveRight(car12_2_2);
                        car12_2_1LayoutParams.leftMargin += 156;
                        car12_2_2LayoutParams.leftMargin += 156;
                        // 움직이면 횟수 +1
                        count.setText("Move: " + ++c);
                    }
                }
            }
        });

        // car13 이동
        car13_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(car13_1LayoutParams.leftMargin == 156) {
                    if (car21_1LayoutParams.topMargin <= 450) {
                        if (checkXInMapL2(car13_1)) {
                            moveLeft(car13_1);
                            moveLeft(car13_2);
                            car13_1LayoutParams.leftMargin -= 156;
                            car13_2LayoutParams.leftMargin -= 156;
                            // 움직이면 횟수 +1
                            count.setText("Move: " + ++c);
                        }
                    }
                }else{
                    if (checkXInMapL2(car13_1)) {
                        moveLeft(car13_1);
                        moveLeft(car13_2);
                        car13_1LayoutParams.leftMargin -= 156;
                        car13_2LayoutParams.leftMargin -= 156;
                        // 움직이면 횟수 +1
                        count.setText("Move: " + ++c);
                    }
                }
            }
        });
        car13_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(car13_1LayoutParams.leftMargin == 0) {
                    if (car31_2_1LayoutParams.topMargin <= 300) {
                        if (checkXInMapR2(car13_2)) {
                            moveRight(car13_1);
                            moveRight(car13_2);
                            car13_1LayoutParams.leftMargin += 156;
                            car13_2LayoutParams.leftMargin += 156;
                            // 움직이면 횟수 +1
                            count.setText("Move: " + ++c);
                        }
                    }
                }else if(car13_1LayoutParams.leftMargin == 312){
                    if (car31_3_1LayoutParams.topMargin <= 300) {
                        if (checkXInMapR2(car13_2)) {
                            moveRight(car13_1);
                            moveRight(car13_2);
                            car13_1LayoutParams.leftMargin += 156;
                            car13_2LayoutParams.leftMargin += 156;
                            // 움직이면 횟수 +1
                            count.setText("Move: " + ++c);
                        }
                    }
                }else{
                    if (checkXInMapR2(car13_2)) {
                        moveRight(car13_1);
                        moveRight(car13_2);
                        car13_1LayoutParams.leftMargin += 156;
                        car13_2LayoutParams.leftMargin += 156;
                        // 움직이면 횟수 +1
                        count.setText("Move: " + ++c);
                    }
                }
            }
        });


        // car21 이동
        car21_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(car21_1LayoutParams.topMargin == 600) {
                    if (car31_1LayoutParams.topMargin != 150) {
                        if (checkYInMapU(car21_1)) {
                            moveUp(car21_1);
                            moveUp(car21_2);
                            car21_1LayoutParams.topMargin -= 150;
                            car21_2LayoutParams.topMargin -= 150;
                            // 움직이면 횟수 +1
                            count.setText("Move: " + ++c);
                        }
                    }
                }else if(car21_1LayoutParams.topMargin == 450){
                    if(car31_1LayoutParams.topMargin != 0) {
                        if (checkYInMapU(car21_1)) {
                            moveUp(car21_1);
                            moveUp(car21_2);
                            car21_1LayoutParams.topMargin -= 150;
                            car21_2LayoutParams.topMargin -= 150;
                            // 움직이면 횟수 +1
                            count.setText("Move: " + ++c);
                        }
                    }
                } else{
                    if (checkYInMapU(car21_1)) {
                        moveUp(car21_1);
                        moveUp(car21_2);
                        car21_1LayoutParams.topMargin -= 150;
                        car21_2LayoutParams.topMargin -= 150;
                        // 움직이면 횟수 +1
                        count.setText("Move: " + ++c);
                    }
                }
            }
        });
        car21_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(car21_1LayoutParams.topMargin == 450) {
                    if (car13_1LayoutParams.leftMargin != 0) {
                        if (checkYInMapD(car21_2)) {
                            moveDown(car21_1);
                            moveDown(car21_2);
                            car21_1LayoutParams.topMargin += 150;
                            car21_2LayoutParams.topMargin += 150;
                            // 움직이면 횟수 +1
                            count.setText("Move: " + ++c);
                        }
                    }
                }else{
                    if (checkYInMapD(car21_2)) {
                        moveDown(car21_1);
                        moveDown(car21_2);
                        car21_1LayoutParams.topMargin += 150;
                        car21_2LayoutParams.topMargin += 150;
                        // 움직이면 횟수 +1
                        count.setText("Move: " + ++c);
                    }
                }
            }
        });

        // car31 이동
        car31_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(car31_1LayoutParams.topMargin == 150) {
                    if (car12_1LayoutParams.leftMargin != 0) {
                        if (checkYInMapU2(car31_1)) {
                            moveUp(car31_1);
                            moveUp(car31_2);
                            car31_1LayoutParams.topMargin -= 150;
                            car31_2LayoutParams.topMargin -= 150;
                            // 움직이면 횟수 +1
                            count.setText("Move: " + ++c);
                        }
                    }
                } else{
                    if (checkYInMapU2(car31_1)) {
                        moveUp(car31_1);
                        moveUp(car31_2);
                        car31_1LayoutParams.topMargin -= 150;
                        car31_2LayoutParams.topMargin -= 150;
                        // 움직이면 횟수 +1
                        count.setText("Move: " + ++c);
                    }
                }
            }
        });
        car31_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (car31_1LayoutParams.topMargin == 150) {
                    if (car21_1LayoutParams.topMargin != 600) {
                        if (checkYInMapD2(car31_2)) {
                            moveDown(car31_1);
                            moveDown(car31_2);
                            car31_1LayoutParams.topMargin += 150;
                            car31_2LayoutParams.topMargin += 150;
                            // 움직이면 횟수 +1
                            count.setText("Move: " + ++c);
                        }
                    }
                }else if(car31_1LayoutParams.topMargin == 0) {
                    if(car21_1LayoutParams.topMargin != 450){
                        if (checkYInMapD2(car31_2)) {
                            moveDown(car31_1);
                            moveDown(car31_2);
                            car31_1LayoutParams.topMargin += 150;
                            car31_2LayoutParams.topMargin += 150;
                            // 움직이면 횟수 +1
                            count.setText("Move: " + ++c);
                        }
                    }
                }else {
                    if (checkYInMapD2(car31_2)) {
                        moveDown(car31_1);
                        moveDown(car31_2);
                        car31_1LayoutParams.topMargin += 150;
                        car31_2LayoutParams.topMargin += 150;
                        // 움직이면 횟수 +1
                        count.setText("Move: " + ++c);
                    }
                }
            }
        });

        // car31_2 이동
        car31_2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (car31_2_1LayoutParams.topMargin == 150) {
                    if (car12_1LayoutParams.leftMargin != 312 && car12_1LayoutParams.leftMargin != 468) {
                        if (checkYInMapU2(car31_2_1)) {
                            moveUp(car31_2_1);
                            moveUp(car31_2_2);
                            car31_2_1LayoutParams.topMargin -= 150;
                            car31_2_2LayoutParams.topMargin -= 150;
                            // 움직이면 횟수 +1
                            count.setText("Move: " + ++c);
                        }
                    }
                } else if(car31_2_1LayoutParams.topMargin == 450) {
                    if(player_1LayoutParams.leftMargin != 312 && player_1LayoutParams.leftMargin != 468)
                        if (checkYInMapU2(car31_2_1)) {
                            moveUp(car31_2_1);
                            moveUp(car31_2_2);
                            car31_2_1LayoutParams.topMargin -= 150;
                            car31_2_2LayoutParams.topMargin -= 150;
                            // 움직이면 횟수 +1
                            count.setText("Move: " + ++c);
                        }
                }
                else {
                    if (checkYInMapU2(car31_2_1)) {
                        moveUp(car31_2_1);
                        moveUp(car31_2_2);
                        car31_2_1LayoutParams.topMargin -= 150;
                        car31_2_2LayoutParams.topMargin -= 150;
                        // 움직이면 횟수 +1
                        count.setText("Move: " + ++c);
                    }
                }
            }
        });
        car31_2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(car31_2_1LayoutParams.topMargin == 150) {
                    if(car12_2_1LayoutParams.leftMargin != 312 && car12_2_1LayoutParams.leftMargin != 468) {
                        if (checkYInMapD2(car31_2_2)) {
                            moveDown(car31_2_1);
                            moveDown(car31_2_2);
                            car31_2_1LayoutParams.topMargin += 150;
                            car31_2_2LayoutParams.topMargin += 150;
                            // 움직이면 횟수 +1
                            count.setText("Move: " + ++c);
                        }
                    }
                }else if(car31_2_1LayoutParams.topMargin == 300){
                    if(car13_1LayoutParams.leftMargin != 156 && car13_1LayoutParams.leftMargin != 312 && car13_1LayoutParams.leftMargin != 468){
                        if (checkYInMapD2(car31_2_2)) {
                            moveDown(car31_2_1);
                            moveDown(car31_2_2);
                            car31_2_1LayoutParams.topMargin += 150;
                            car31_2_2LayoutParams.topMargin += 150;
                            // 움직이면 횟수 +1
                            count.setText("Move: " + ++c);
                        }
                    }
                }else{
                    if (checkYInMapD2(car31_2_2)) {
                        moveDown(car31_2_1);
                        moveDown(car31_2_2);
                        car31_2_1LayoutParams.topMargin += 150;
                        car31_2_2LayoutParams.topMargin += 150;
                        // 움직이면 횟수 +1
                        count.setText("Move: " + ++c);
                    }
                }
            }
        });

        // car31_3 이동
        car31_3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(car31_3_1LayoutParams.topMargin == 150) {
                    if(car12_1LayoutParams.leftMargin != 624) {
                        if (checkYInMapU2(car31_3_1)) {
                            moveUp(car31_3_1);
                            moveUp(car31_3_2);
                            car31_3_1LayoutParams.topMargin -= 150;
                            car31_3_2LayoutParams.topMargin -= 150;
                            // 움직이면 횟수 +1
                            count.setText("Move: " + ++c);
                        }
                    }
                }else{
                    if (checkYInMapU2(car31_3_1)) {
                        moveUp(car31_3_1);
                        moveUp(car31_3_2);
                        car31_3_1LayoutParams.topMargin -= 150;
                        car31_3_2LayoutParams.topMargin -= 150;
                        // 움직이면 횟수 +1
                        count.setText("Move: " + ++c);
                    }
                }
            }
        });
        car31_3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (car31_3_1LayoutParams.topMargin == 150) {
                    if (car12_2_1LayoutParams.leftMargin != 624) {
                        if (checkYInMapD2(car31_3_2)) {
                            moveDown(car31_3_1);
                            moveDown(car31_3_2);
                            car31_3_1LayoutParams.topMargin += 150;
                            car31_3_2LayoutParams.topMargin += 150;
                            // 움직이면 횟수 +1
                            count.setText("Move: " + ++c);
                        }
                    }
                } else if (car31_3_1LayoutParams.topMargin == 300) {
                    if (car13_1LayoutParams.leftMargin != 468) {
                        if (checkYInMapD2(car31_3_2)) {
                            moveDown(car31_3_1);
                            moveDown(car31_3_2);
                            car31_3_1LayoutParams.topMargin += 150;
                            car31_3_2LayoutParams.topMargin += 150;
                            // 움직이면 횟수 +1
                            count.setText("Move: " + ++c);
                        }
                    }
                } else {
                    if (checkYInMapD2(car31_3_2)) {
                        moveDown(car31_3_1);
                        moveDown(car31_3_2);
                        car31_3_1LayoutParams.topMargin += 150;
                        car31_3_2LayoutParams.topMargin += 150;
                        // 움직이면 횟수 +1
                        count.setText("Move: " + ++c);
                    }
                }
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

        if(car.getY() < 700){
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