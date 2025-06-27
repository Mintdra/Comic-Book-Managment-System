class SubscriptionPlan {

    int plan_id;
    String plan_name;
    int duration_days;
    String feature_included;
    String payment_methods;
    double price;
    public SubscriptionPlan(int plan_id, String plan_name, int duration_days, String feature_included,
            String payment_methods, double price) {
        this.plan_id = plan_id;
        this.plan_name = plan_name;
        this.duration_days = duration_days;
        this.feature_included = feature_included;
        this.payment_methods = payment_methods;
        this.price = price;
    }
}

// Check Balance and Payment (Money is it Enough to pay for the subscription plan)
// Purchased Subscription Plan also Purchase date
// Cancel Subscription Plan; Renew Subscription Plan
// Notify the user about the purchase & the near date expires