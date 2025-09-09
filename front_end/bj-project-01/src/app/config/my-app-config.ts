import { environment } from "../../environments/environment";

export default {
    auth: {
        domain: "dev-hwgwps8vm7fnmqxp.us.auth0.com",
        clientId: "RPz7jcYcxjKNX1CBCA8LK8JIHRgqPWNg",
        authorizationParams: {
            redirect_uri: "https://localhost:4200/login/callback",
            audience: "http://localhost:8080"
        },
    },
    httpInterceptor: {
        allowedList: [
            environment.bemjiApiUrl + '/orders/**',
            environment.bemjiApiUrl + '/checkout/purchase',
            environment.bemjiApiUrl + '/checkout/payment-intent'
        ],
    },
}