package designpat.websearch;

/**
 * Watches the search queries
 */
public class Snooper {
    private final WebSearchModel model;

    public Snooper(WebSearchModel model) {
        this.model = model;

        model.addQueryObserver(new WebSearchModel.QueryObserver() {
            private QueryFilter filter = new YesFilter();

            @Override
            public void onQuery(String query) {
                if(filter != null) {
                    if (filter.filter(query)) {
                        System.out.println("Oh yes: " + query);
                    }
                }
            }

            @Override
            public void setFilter(QueryFilter filter) {
                this.filter = filter;
            }
        });

        model.addQueryObserver(new WebSearchModel.QueryObserver() {
            private QueryFilter filter = new LongFilter();

            @Override
            public void onQuery(String query) {
                if(filter != null) {
                    if (filter.filter(query)) {
                        System.out.println("So long...: " + query);
                    }
                }
            }

            @Override
            public void setFilter(QueryFilter filter) {
                this.filter = filter;
            }
        });
    }
}
