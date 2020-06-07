package ru.job4j.ex;

/**
 * необходимо реализовать метод findUser, validate и main.
 *
 */
public class UserStore {
    /**
     * findUser - если пользователя не нашли в списке, то кинуть исключение UserNotFoundException.
     *
     * @param users
     * @param login
     * @return
     * @throws UserNotFoundException
     */
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = null;
        for (int index = 0; index < users.length; index++) {
            if (users[index].getUsername().equals(login)) {
                user = users[index];
                break;
            }
        }
        if (user == null) {
            throw new UserNotFoundException("User is not in the list");
        }
        return null;
    }


    /**
     * validate - если пользователь не валидный или если имя пользователя состоит из менее трех символов,
     * то кинуть исключение UserInvalidException
     * Метод validate принимает аргумент user. У объекта user есть метод isValid().
     * Если он false, то нужно выкинуть исключение UserInvalidException.
     * Так же в этом методе нужно проверить, что у объекта user количество символов в поле username меньше 3.
     * Если оно меньше, то нужно выкинуть исключение UserInvalidException.
     * Для этого нужно воспользоваться методом String.lenght().
     * @param user
     * @return
     * @throws UserInvalidException
     */
    public static boolean validate(User user) throws UserNotFoundException {
        if (user.getUsername().length() < 3) {
            throw new UserInvalidException("If the user is not valid");
        } else if (user.isValid()) {
            throw new UserNotFoundException("User is not found");
        }
        return false;
    }


    /**
     * main - поправить код за счет использования try-catch с множественным блоком catch.
     * В блоке catch(UserNotFoundException) - должно быть выведено на консоль сообщение, что пользователя не найдено.
     * В блоке  catch(UserInvalidException) - должно быть выведено на консоль сообщение, что пользователь не валидный.
     * @param args
     */
    public static void main(String[] args) {
        try {
            User[] users = {
                    new User("Ivan Ivanov", false)
            };
            User user = findUser(users, "Ivan Ivanov");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ab) {
            ab.printStackTrace();
        } catch (UserNotFoundException cd) {
            cd.printStackTrace();
        }
    }
}