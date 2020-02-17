package com.example.parseinstagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseQuery;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "LoginActivity";

    private EditText etDescription;
    private Button btnCaptureImage;
    private ImageView ivPostImage;
    private Button btnSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etDescription=findViewById(R.id.etDescription);
        btnCaptureImage=findViewById(R.id.btnCaptureImage);
        ivPostImage=findViewById(R.id.ivPostImage);
        btnSubmit=findViewById(R.id.btnSubmit);
        
        queryPosts();
    }

    private void queryPosts() {
        ParseQuery<Post> postQuery=new ParseQuery<Post>(Post.class);
        postQuery.findInBackground(new FindCallback<Post>() {
            @Override
            public void done(List<Post> posts, ParseException e) {
                for(int i=0;i<posts.size();i++){
                    Post post=posts.get(i);
                }
            }
        });
    }
}
