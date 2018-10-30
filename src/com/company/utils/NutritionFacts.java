package com.company.utils;

public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder implements AbstractBuilder<NutritionFacts> {
        // Required parameters
        private final int servingSize;
        private final int servings;

        // Optional parameters - initialized to default values
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            if (val < 0) {
                throw new IllegalArgumentException("Calories must be >= 0");
            }
            calories = val;
            return this;
        }

        public Builder fat(int val) {
            if (val < 0) {
                throw new IllegalArgumentException("Fat must be >= 0");
            }
            fat = val;
            return this;
        }

        public Builder sodium(int val) {
            if (val < 0) {
                throw new IllegalArgumentException("Sodium must be >= 0");
            }
            sodium = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            if (val < 0) {
                throw new IllegalArgumentException("Carbohydrate must be >= 0");
            }
            carbohydrate = val;
            return this;
        }

        @Override
        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    public int getServingSize() {
        return servingSize;
    }

    public int getServings() {
        return servings;
    }

    public int getCalories() {
        return calories;
    }

    public int getFat() {
        return fat;
    }

    public int getSodium() {
        return sodium;
    }

    public int getCarbohydrate() {
        return carbohydrate;
    }

    public static void main(String[] args) {
        NutritionFacts cocaCola = new Builder(240, 8)
                .calories(100).sodium(35).carbohydrate(27).build();
        System.out.println(cocaCola.getServingSize());
        System.out.println(cocaCola.getServings());
        System.out.println(cocaCola.getCalories());
        System.out.println(cocaCola.getFat());
        System.out.println(cocaCola.getSodium());
        System.out.println(cocaCola.getCarbohydrate());
    }

}
