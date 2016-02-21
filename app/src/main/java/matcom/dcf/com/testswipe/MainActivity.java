package matcom.dcf.com.testswipe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //

        FrameLayout.LayoutParams contentParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
      //
        FrameLayout fl = (FrameLayout) findViewById(R.id.fl1);
       // fl.setLayoutParams(contentParams);
        //fl.layout(550,50,100,100);

        RelativeLayout.LayoutParams rlParams =
                (RelativeLayout.LayoutParams)fl.getLayoutParams();
        rlParams.setMargins(250, 150, 300, 0);
        fl.setLayoutParams(rlParams);
    }
}
