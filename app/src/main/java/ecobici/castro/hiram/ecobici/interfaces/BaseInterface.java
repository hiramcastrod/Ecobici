package ecobici.castro.hiram.ecobici.interfaces;

public interface BaseInterface {

    public interface Model<T> {
        void onSuccess(T var);

        void onFailure(T var);
    }

    public interface Presenter{
        void onViewCreated();

        void onDestroy();

        }

    public interface View{
        void showLoader();

        void hideLoader();
    }
    }

