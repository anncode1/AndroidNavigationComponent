package com.anncode.androidnavigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_my_profile.*

/**
 * A simple [Fragment] subclass.
 */
class MyProfileFragment : Fragment() {

    private val args: MyProfileFragmentArgs? by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        args?.user?.let {
            val profile = "\n\nName: ${it.name}" + "\nHobby: ${it.hobby}"
            tv_profile.append(profile)
        }
    }

}
