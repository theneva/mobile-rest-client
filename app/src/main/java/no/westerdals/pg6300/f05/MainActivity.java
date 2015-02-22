package no.westerdals.pg6300.f05;

import android.app.Activity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import no.westerdals.pg6300.f05.model.User;
import org.androidannotations.annotations.*;
import org.androidannotations.annotations.rest.RestService;

import java.util.List;

@EActivity(R.layout.activity_main)
public class MainActivity extends Activity
{
    public static final String TAG = "MainActivity";

    @ViewById
    ListView usersListView;

    @RestService
    UserClient userClient;

    @AfterViews
    void afterViews()
    {
        getAndListUsers();
    }

    @Background
    @Click(R.id.loadUsersButton)
    @Trace(tag = TAG, level = Log.VERBOSE)
    void getAndListUsers()
    {
        final List<User> users = userClient.query();
        listUsers(users);
    }

    @UiThread
    @Trace(tag = TAG, level = Log.VERBOSE)
    void listUsers(final List<User> users)
    {
        final ArrayAdapter<User> adapter = new ArrayAdapter<>(this, R.layout.row_user_list, users);
        usersListView.setAdapter(adapter);
    }
}
