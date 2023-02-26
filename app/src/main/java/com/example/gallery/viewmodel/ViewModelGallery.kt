package com.example.gallery.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.gallery.model.ModelGallery

class ViewModelGallery:ViewModel() {

    var count = MutableLiveData<Int>()
    private var list = ArrayList<ModelGallery>()
    private var counter = 0
      fun addImage(list1: ArrayList<ModelGallery>) {
         list1.add(ModelGallery("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTfNr19ZXi4kjvwPudi3jgq_I_QBO_MWvVSwQ&usqp=CAU",false))
         list1.add(ModelGallery("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcStSflm2wIGJIpANZVIeXVT90-qQ6DDF_nfoA&usqp=CAU",false))
         list1.add(ModelGallery("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcStSflm2wIGJIpANZVIeXVT90-qQ6DDF_nfoA&usqp=CAU",false))
         list1.add(ModelGallery("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcStSflm2wIGJIpANZVIeXVT90-qQ6DDF_nfoA&usqp=CAU",false))
         list1.add(ModelGallery("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcStSflm2wIGJIpANZVIeXVT90-qQ6DDF_nfoA&usqp=CAU",false))
         list1.add(ModelGallery("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcStSflm2wIGJIpANZVIeXVT90-qQ6DDF_nfoA&usqp=CAU",false))
         list1.add(ModelGallery("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcStSflm2wIGJIpANZVIeXVT90-qQ6DDF_nfoA&usqp=CAU",false))
         list1.add(ModelGallery("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcStSflm2wIGJIpANZVIeXVT90-qQ6DDF_nfoA&usqp=CAU",false))
         list1.add(ModelGallery("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcStSflm2wIGJIpANZVIeXVT90-qQ6DDF_nfoA&usqp=CAU",false))
         list1.add(ModelGallery("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcStSflm2wIGJIpANZVIeXVT90-qQ6DDF_nfoA&usqp=CAU",false))
         list1.add(ModelGallery("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcStSflm2wIGJIpANZVIeXVT90-qQ6DDF_nfoA&usqp=CAU",false))
     }

}
