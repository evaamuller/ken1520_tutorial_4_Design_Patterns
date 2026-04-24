package designpat.websearch;

public class LongFilter implements QueryFilter {
    @Override
    public boolean filter(String query) {
        return query.length() > 60;
    }
}
