package com.sumaya.myapplication.ui.displayInfo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.sumaya.myapplication.ui.register.KEY
import com.sumaya.myapplication.data.PersonInfo
import com.sumaya.myapplication.R

class InfoFragment : Fragment() {

    companion object {
        fun newInstance() = InfoFragment()
    }

    private lateinit var name :TextView
    private lateinit var brithday :TextView
    private lateinit var phone :TextView
    private lateinit var gender :TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (arguments != null){

            name = view.findViewById(R.id.fIName)
            brithday = view.findViewById(R.id.fIBd)
            phone = view.findViewById(R.id.fIPhone)
            gender = view.findViewById(R.id.fIGender)

            requireArguments().getParcelable<PersonInfo>(KEY).let{
                name.text = "${getString(R.string.name1)} ${it?.name}"
                brithday.text = "${getString(R.string.birthday1)} ${it?.birthday}"
                phone.text = "${getString(R.string.phone1)} ${it?.phone}"
                gender.text = "${getString(R.string.gender1)} ${it?.gender}"
            }
        }
    }
}