package no.westerdals.pg6300.f05;

import android.app.Activity;
import android.widget.TextView;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends Activity
{
    @ViewById
    TextView helloTextView;

//    @RestService
//    UserClient userClient;

    @AfterViews
    void afterViews() {
        helloTextView.setText("banana");
    }
}
