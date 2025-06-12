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
