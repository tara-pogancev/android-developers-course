package com.tarapogancev.affirmations

import android.content.Context
import com.tarapogancev.affirmations.adapter.ItemAdapter
import com.tarapogancev.affirmations.model.Affirmation
import org.junit.Assert
import org.junit.Test
import org.junit.runner.manipulation.Ordering
import org.mockito.Mockito.mock

class AffirmationsAdapterTest {

    private val context = mock(Context::class.java)

    @Test
    fun adapter_size() {
        val data = listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2)
        )

        val adapter = ItemAdapter(context, data)

        Assert.assertEquals("ItemAdapter is not the correct size", data.size, adapter.itemCount)

    }


}