package {{ global_computed_inputs.base_package }}.messaging.producer

import org.springframework.stereotype.Configuration

@Configuration
class {{ class_name }}ServiceConfiguration {

    private companion object {
        const val BASE_URL = "{{ base_url }}"
    }

    private fun buildClient() = OkHttpClient.Builder().build()

    private fun buildRetrofit() = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(buildClient())
        .build()

    // TODO declare the interface to be implemented by Retrofit

}


