package com.learn.basicprocedure.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.learn.basicprocedure.R;

/**
 * Created with Android Studio.
 *
 * @Auther: Oji
 * @Date: 2020/04/19/20:52
 * @Description:
 */
public class OneFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.one_fragment, null);
        return view;
    }
}
