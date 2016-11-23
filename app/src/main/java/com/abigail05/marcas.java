package com.abigail05;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class marcas extends AppCompatActivity {

    ImageView pilim;
    String url="https://lh3.googleusercontent.com/ZfjqEDdPk9UP0SPjIkH6yNgRctWcHjTl9-mQzIuxpbhbIAEspckbwveCXpOjAlL3v81IgIWkhF8UK-vJ0osLh6JdjyLXyvDBlF6x-a0bYdr_Mnbj2CkqQFqQZ5bxDNaDuBJlbCgF2V5ZKBwEPfPbOvstPJ8vKVzgKkjZ3S-JLjhmtnwjGI7bM6hpoOOYfkxTN7RZy0fAZUQ2l3B7dGU6KCezXcKkgHEJIue2aNMVJRMF3_aAbGRJfU9Ook9Lcp61KRYLZlBLkYPUV7XOc5fPmMgr9Lxg2cJ5Ge7ptK_Z7VqOigr1cBBLHmq-9ra70Z3d9_Lt2QHRLVpoi5t-Dstr6WnGxuVBqey9UlanRpXCfVVv6RKHOBYSOd5cldKTryeYQOCwTLW2xBxZNbyd6cfC6DlAOAOHsQAUzFUnWV7jaXF3S28tpDyovKmOfkvnOzcieXUo5i2mNr5uAt0u01qWfP2i31gozIHfmm70jetmJ3KR1SceEYfjd8VHvV0al17gJZLwq2BQ1UUOSVX_WvhSoESOWi2FUmwxbQuGcc4eNiLGPKT5HfYE7ly54QIRi1vTmW5Q1R4Yhrl6mMScHfF67JbI3py2ILO5vTJ9MW0LqNXwWtGA-A=w260-h214-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marcas);

        pilim = (ImageView) findViewById(R.id.pilim);
        Picasso.with(this).load(url).into(pilim);
    }
}
