package com.company.controller;

import com.company.ExistedLoginException;
import com.company.view.View;

import java.util.Scanner;

import static com.company.controller.RegexContainer.*;
import static com.company.controller.RegexContainer.REGEX_LOGIN;
import static com.company.view.TextConstant.*;
import static com.company.view.TextConstant.LOGIN_DATA;

/**
 * Created by student on 26.09.2017.
 */
public class InputNoteNoteBook {
    private View view;
    private Scanner sc;
    private String existedLogins[] = new String[]{
            "misha111",
            "grysha22",
            "pahevich33"
    };

    private String firstName;
    private String login;

    public InputNoteNoteBook(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    public void inputNote() {
        UtilityController utilityController =
                new UtilityController(sc, view);
        String str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? REGEX_NAME_UKR : REGEX_NAME_LAT;

        this.firstName = utilityController.inputStringValueWithScanner
                (FIRST_NAME, str);

        login= inputLogin(utilityController);

    }

    private String inputLogin (UtilityController utilityController) {
        String localLogin = utilityController.inputStringValueWithScanner
                (LOGIN_DATA, REGEX_LOGIN);
        try {
            for (String login : existedLogins) {
                if (login.equals(localLogin)) {
                    throw new ExistedLoginException();
                }
            }
        } catch (ExistedLoginException e) {
            view.printMessage(e.getMessage());
            return inputLogin(utilityController);
        }

        return localLogin;

    }
}
