int stringlen(char string[])
{
    int i = 0;

    while (string[i] != '\0')
    {
        i++;
    }

    return i;
}

void stringcon(char *str1, char *str2)
{
    int j = 0, i = 0, z = 0;

    while (*str1 != '\0')
    {
        str1++;
    }

    for (j = 0; *str2 != '\0'; j++)
    {
        *str1 = *str2;
        str1++;
        str2++;
    }

    *str1 = '\0';
}

void stringcpy(char *ptr1, char *ptr2)
{
    while (*ptr1 != '\0')
    {
        *ptr2 = *ptr1;
        ptr1++;
        ptr2++;
    }
}

int compare(char *str1, char *str2)
{
    int i = 0;

    while (1)
    {
        if (*str1 != *str2)
        {
            return 0;
        }

        if (*str1 == '\0' && *str2 == '\0')
        {
            return 1;
        }
        str1++;
        str2++;
    }
}

int search(char str1[])
{
    int i = 0, pos = 0;

    while (str1[i] != '\0')
    {
        if (str1[i] == 'c')
        {
            pos = i + 1;
            break;
        }
        i++;
    }
    return pos;
}

int findword(char str1[], char str2[])
{
    int i = 0, j, flag;
    while (i != stringlen(str1))
    {
        for (j = i; j < stringlen(str2) + i; j++)
        {
            if (str1[j] == str2[j - i])
            {
                flag = 1;
            }
            else
            {
                flag = 0;
                break;
            }
        }
        if (flag == 1)
        {
            return 1;
            break;
        }
        i++;
    }
    return 0;
}

void revstring(char str1[])
{
    char temp[1000];
    int i = 0;
    int l = stringlen(str1) - 1;
    stringcpy(str1, temp);

    for (i = 0; str1[i] != '\0'; i++)
    {
        str1[i] = temp[l - i];
    }
}