.class public final Lz4/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "\"\\"

    invoke-static {v0}, Lf5/h;->d(Ljava/lang/String;)Lf5/h;

    const-string v0, "\t ,="

    invoke-static {v0}, Lf5/h;->d(Ljava/lang/String;)Lf5/h;

    return-void
.end method

.method public static a(Lv4/b0;)J
    .locals 2

    .line 1
    iget-object p0, p0, Lv4/b0;->g:Lv4/p;

    .line 2
    .line 3
    const-string v0, "Content-Length"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lv4/p;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 13
    .line 14
    .line 15
    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    goto :goto_1

    .line 17
    :catch_0
    :goto_0
    const-wide/16 v0, -0x1

    .line 18
    .line 19
    :goto_1
    return-wide v0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
.end method

.method public static b(Lv4/b0;)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lv4/b0;->b:Lv4/x;

    .line 2
    .line 3
    iget-object v0, v0, Lv4/x;->b:Ljava/lang/String;

    .line 4
    .line 5
    const-string v1, "HEAD"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    const/16 v0, 0x64

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    iget v3, p0, Lv4/b0;->d:I

    .line 19
    .line 20
    if-lt v3, v0, :cond_1

    .line 21
    .line 22
    const/16 v0, 0xc8

    .line 23
    .line 24
    if-lt v3, v0, :cond_2

    .line 25
    .line 26
    :cond_1
    const/16 v0, 0xcc

    .line 27
    .line 28
    if-eq v3, v0, :cond_2

    .line 29
    .line 30
    const/16 v0, 0x130

    .line 31
    .line 32
    if-eq v3, v0, :cond_2

    .line 33
    .line 34
    return v2

    .line 35
    :cond_2
    invoke-static {p0}, Lz4/e;->a(Lv4/b0;)J

    .line 36
    .line 37
    .line 38
    move-result-wide v3

    .line 39
    const-wide/16 v5, -0x1

    .line 40
    .line 41
    cmp-long v0, v3, v5

    .line 42
    .line 43
    if-nez v0, :cond_4

    .line 44
    .line 45
    const-string v0, "Transfer-Encoding"

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Lv4/b0;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    const-string v0, "chunked"

    .line 52
    .line 53
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-eqz p0, :cond_3

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    return v1

    .line 61
    :cond_4
    :goto_0
    return v2
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
.end method

.method public static c(Ljava/lang/String;I)I
    .locals 2

    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const-wide/32 v0, 0x7fffffff

    cmp-long v0, p0, v0

    if-lez v0, :cond_0

    const p0, 0x7fffffff

    return p0

    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-gez v0, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    long-to-int p0, p0

    return p0

    :catch_0
    return p1
.end method

.method public static d(Lv4/j;Lv4/q;Lv4/p;)V
    .locals 33

    move-object/from16 v0, p2

    sget-object v1, Lv4/j;->a:Lv4/j$a;

    move-object/from16 v2, p0

    if-ne v2, v1, :cond_0

    return-void

    :cond_0
    sget-object v1, Lv4/i;->j:Ljava/util/regex/Pattern;

    const-string v1, "Set-Cookie"

    .line 1
    iget-object v3, v0, Lv4/p;->a:[Ljava/lang/String;

    .line 2
    array-length v3, v3

    const/4 v4, 0x2

    div-int/2addr v3, v4

    const/4 v5, 0x0

    move v7, v5

    const/4 v8, 0x0

    :goto_0
    if-ge v7, v3, :cond_3

    .line 3
    invoke-virtual {v0, v7}, Lv4/p;->d(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_2

    if-nez v8, :cond_1

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8, v4}, Ljava/util/ArrayList;-><init>(I)V

    :cond_1
    invoke-virtual {v0, v7}, Lv4/p;->g(I)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_3
    if-eqz v8, :cond_4

    invoke-static {v8}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :cond_4
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    :goto_1
    move-object v1, v0

    .line 4
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    move v4, v5

    const/4 v7, 0x0

    :goto_2
    if-ge v4, v3, :cond_42

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    .line 6
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v11

    const/16 v12, 0x3b

    invoke-static {v8, v5, v11, v12}, Lw4/e;->f(Ljava/lang/String;IIC)I

    move-result v0

    const/16 v13, 0x3d

    invoke-static {v8, v5, v0, v13}, Lw4/e;->f(Ljava/lang/String;IIC)I

    move-result v14

    if-ne v14, v0, :cond_6

    :cond_5
    move-object/from16 v6, p1

    move-object/from16 v26, v1

    move v2, v5

    goto/16 :goto_29

    :cond_6
    invoke-static {v5, v14, v8}, Lw4/e;->u(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/String;->isEmpty()Z

    move-result v16

    if-nez v16, :cond_5

    .line 7
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v6

    :goto_3
    const/16 v12, 0x1f

    if-ge v5, v6, :cond_8

    invoke-virtual {v15, v5}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-le v13, v12, :cond_9

    const/16 v12, 0x7f

    if-lt v13, v12, :cond_7

    goto :goto_4

    :cond_7
    add-int/lit8 v5, v5, 0x1

    const/16 v12, 0x3b

    goto :goto_3

    :cond_8
    const/4 v5, -0x1

    :cond_9
    :goto_4
    const/4 v6, -0x1

    if-eq v5, v6, :cond_a

    :goto_5
    move-object/from16 v6, p1

    :goto_6
    move-object/from16 v26, v1

    goto/16 :goto_25

    :cond_a
    add-int/lit8 v14, v14, 0x1

    .line 8
    invoke-static {v14, v0, v8}, Lw4/e;->u(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 9
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    const/4 v12, 0x0

    :goto_7
    if-ge v12, v6, :cond_d

    invoke-virtual {v5, v12}, Ljava/lang/String;->charAt(I)C

    move-result v13

    const/16 v14, 0x1f

    if-le v13, v14, :cond_c

    const/16 v14, 0x7f

    if-lt v13, v14, :cond_b

    goto :goto_8

    :cond_b
    add-int/lit8 v12, v12, 0x1

    goto :goto_7

    :cond_c
    :goto_8
    move v6, v12

    goto :goto_9

    :cond_d
    const/4 v6, -0x1

    :goto_9
    const/4 v12, -0x1

    if-eq v6, v12, :cond_e

    goto :goto_5

    :cond_e
    add-int/lit8 v0, v0, 0x1

    const-wide v17, 0xe677d21fdbffL

    move-wide/from16 v26, v17

    const/4 v14, 0x0

    const-wide/16 v19, -0x1

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x1

    const/16 v25, 0x0

    const/16 v28, 0x0

    :goto_a
    const-wide v29, 0x7fffffffffffffffL

    const-wide/high16 v31, -0x8000000000000000L

    if-ge v0, v11, :cond_1c

    const/16 v12, 0x3b

    .line 10
    invoke-static {v8, v0, v11, v12}, Lw4/e;->f(Ljava/lang/String;IIC)I

    move-result v13

    const/16 v12, 0x3d

    invoke-static {v8, v0, v13, v12}, Lw4/e;->f(Ljava/lang/String;IIC)I

    move-result v6

    invoke-static {v0, v6, v8}, Lw4/e;->u(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-ge v6, v13, :cond_f

    add-int/lit8 v6, v6, 0x1

    invoke-static {v6, v13, v8}, Lw4/e;->u(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    goto :goto_b

    :cond_f
    const-string v6, ""

    :goto_b
    const-string v12, "expires"

    invoke-virtual {v0, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_10

    :try_start_0
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {v0, v6}, Lv4/i;->b(ILjava/lang/String;)J

    move-result-wide v26
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_d

    :cond_10
    const-string v12, "max-age"

    invoke-virtual {v0, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_14

    .line 11
    :try_start_1
    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v19
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    const-wide/16 v29, 0x0

    cmp-long v0, v19, v29

    if-gtz v0, :cond_12

    goto :goto_c

    :catch_0
    move-exception v0

    move-object v12, v0

    :try_start_2
    const-string v0, "-?\\d+"

    invoke-virtual {v6, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_13

    const-string v0, "-"

    invoke-virtual {v6, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_11

    :goto_c
    move-wide/from16 v19, v31

    goto :goto_d

    :cond_11
    move-wide/from16 v19, v29

    :cond_12
    :goto_d
    const/16 v25, 0x1

    goto :goto_e

    :cond_13
    throw v12
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    :cond_14
    const-string v12, "domain"

    .line 12
    invoke-virtual {v0, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_18

    :try_start_3
    const-string v0, "."

    .line 13
    invoke-virtual {v6, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_17

    invoke-virtual {v6, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_15

    const/4 v12, 0x1

    invoke-virtual {v6, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    :cond_15
    invoke-static {v6}, Lw4/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_16

    move-object v14, v0

    const/16 v24, 0x0

    goto :goto_e

    :cond_16
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_17
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_1

    :cond_18
    const-string v12, "path"

    .line 14
    invoke-virtual {v0, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_19

    move-object/from16 v28, v6

    goto :goto_e

    :cond_19
    const-string v6, "secure"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1a

    const/16 v22, 0x1

    goto :goto_e

    :cond_1a
    const-string v6, "httponly"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1b

    const/16 v23, 0x1

    :catch_1
    :cond_1b
    :goto_e
    add-int/lit8 v0, v13, 0x1

    goto/16 :goto_a

    :cond_1c
    cmp-long v0, v19, v31

    if-nez v0, :cond_1d

    move-object/from16 v6, p1

    move-wide/from16 v18, v31

    goto :goto_10

    :cond_1d
    const-wide/16 v11, -0x1

    cmp-long v0, v19, v11

    if-eqz v0, :cond_21

    const-wide v11, 0x20c49ba5e353f7L

    cmp-long v0, v19, v11

    if-gtz v0, :cond_1e

    const-wide/16 v11, 0x3e8

    mul-long v29, v19, v11

    :cond_1e
    add-long v29, v9, v29

    cmp-long v0, v29, v9

    if-ltz v0, :cond_20

    cmp-long v0, v29, v17

    if-lez v0, :cond_1f

    goto :goto_f

    :cond_1f
    move-object/from16 v6, p1

    move-wide/from16 v18, v29

    goto :goto_10

    :cond_20
    :goto_f
    move-object/from16 v6, p1

    move-wide/from16 v18, v17

    goto :goto_10

    :cond_21
    move-object/from16 v6, p1

    move-wide/from16 v18, v26

    .line 15
    :goto_10
    iget-object v0, v6, Lv4/q;->d:Ljava/lang/String;

    const/16 v8, 0x2e

    if-nez v14, :cond_22

    move-object v14, v0

    goto :goto_13

    .line 16
    :cond_22
    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_23

    goto :goto_11

    :cond_23
    invoke-virtual {v0, v14}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_24

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v9

    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v10

    sub-int/2addr v9, v10

    const/4 v10, 0x1

    sub-int/2addr v9, v10

    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-ne v9, v8, :cond_24

    .line 17
    sget-object v9, Lw4/e;->k:Ljava/util/regex/Pattern;

    invoke-virtual {v9, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v9

    invoke-virtual {v9}, Ljava/util/regex/Matcher;->matches()Z

    move-result v9

    if-nez v9, :cond_24

    :goto_11
    const/4 v9, 0x1

    goto :goto_12

    :cond_24
    const/4 v9, 0x0

    :goto_12
    if-nez v9, :cond_25

    goto/16 :goto_6

    .line 18
    :cond_25
    :goto_13
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v9

    if-eq v0, v9, :cond_3b

    .line 19
    sget-object v9, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->h:Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;

    .line 20
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    invoke-static {v14}, Ljava/net/IDN;->toUnicode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v10, "\\."

    invoke-virtual {v0, v10}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v10

    .line 22
    iget-object v0, v9, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_27

    iget-object v0, v9, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v11, 0x0

    const/4 v12, 0x1

    invoke-virtual {v0, v11, v12}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_27

    const/4 v11, 0x0

    .line 23
    :goto_14
    :try_start_4
    invoke-virtual {v9}, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->b()V
    :try_end_4
    .catch Ljava/io/InterruptedIOException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v11, :cond_28

    goto :goto_15

    :catchall_0
    move-exception v0

    goto :goto_16

    :catch_2
    move-exception v0

    move-object v12, v0

    .line 24
    :try_start_5
    sget-object v0, Lc5/f;->a:Lc5/f;

    const-string v13, "Failed to read public suffix list"

    const/4 v8, 0x5

    .line 25
    invoke-virtual {v0, v8, v13, v12}, Lc5/f;->m(ILjava/lang/String;Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-eqz v11, :cond_28

    :goto_15
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    goto :goto_17

    :catch_3
    :try_start_6
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    const/16 v8, 0x2e

    const/4 v11, 0x1

    goto :goto_14

    :goto_16
    if-eqz v11, :cond_26

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    :cond_26
    throw v0

    .line 26
    :cond_27
    :try_start_7
    iget-object v0, v9, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_7
    .catch Ljava/lang/InterruptedException; {:try_start_7 .. :try_end_7} :catch_4

    goto :goto_17

    :catch_4
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_28
    :goto_17
    monitor-enter v9

    :try_start_8
    iget-object v0, v9, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->c:[B

    if-eqz v0, :cond_3a

    monitor-exit v9
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    array-length v0, v10

    new-array v8, v0, [[B

    const/4 v11, 0x0

    :goto_18
    array-length v12, v10

    if-ge v11, v12, :cond_29

    aget-object v12, v10, v11

    sget-object v13, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v12, v13}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v12

    aput-object v12, v8, v11

    add-int/lit8 v11, v11, 0x1

    goto :goto_18

    :cond_29
    const/4 v11, 0x0

    :goto_19
    if-ge v11, v0, :cond_2b

    iget-object v12, v9, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->c:[B

    invoke-static {v12, v8, v11}, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->a([B[[BI)Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_2a

    const/4 v11, 0x1

    goto :goto_1a

    :cond_2a
    add-int/lit8 v11, v11, 0x1

    goto :goto_19

    :cond_2b
    const/4 v11, 0x1

    const/4 v12, 0x0

    :goto_1a
    if-le v0, v11, :cond_2d

    invoke-virtual {v8}, [[B->clone()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, [[B

    move-object/from16 v26, v1

    const/4 v1, 0x0

    :goto_1b
    array-length v2, v13

    sub-int/2addr v2, v11

    if-ge v1, v2, :cond_2e

    sget-object v2, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->e:[B

    aput-object v2, v13, v1

    iget-object v2, v9, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->c:[B

    invoke-static {v2, v13, v1}, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->a([B[[BI)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2c

    goto :goto_1c

    :cond_2c
    add-int/lit8 v1, v1, 0x1

    const/4 v11, 0x1

    goto :goto_1b

    :cond_2d
    move-object/from16 v26, v1

    :cond_2e
    const/4 v2, 0x0

    :goto_1c
    if-eqz v2, :cond_30

    const/4 v1, 0x0

    :goto_1d
    add-int/lit8 v11, v0, -0x1

    if-ge v1, v11, :cond_30

    iget-object v11, v9, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->d:[B

    invoke-static {v11, v8, v1}, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->a([B[[BI)Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_2f

    goto :goto_1e

    :cond_2f
    add-int/lit8 v1, v1, 0x1

    goto :goto_1d

    :cond_30
    const/4 v11, 0x0

    :goto_1e
    if-eqz v11, :cond_31

    const-string v0, "!"

    invoke-virtual {v0, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\."

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    goto :goto_21

    :cond_31
    if-nez v12, :cond_32

    if-nez v2, :cond_32

    sget-object v0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->g:[Ljava/lang/String;

    goto :goto_21

    :cond_32
    if-eqz v12, :cond_33

    const-string v0, "\\."

    invoke-virtual {v12, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    goto :goto_1f

    :cond_33
    sget-object v0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->f:[Ljava/lang/String;

    :goto_1f
    if-eqz v2, :cond_34

    const-string v1, "\\."

    invoke-virtual {v2, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    goto :goto_20

    :cond_34
    sget-object v1, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->f:[Ljava/lang/String;

    :goto_20
    array-length v2, v0

    array-length v8, v1

    if-le v2, v8, :cond_35

    goto :goto_21

    :cond_35
    move-object v0, v1

    .line 27
    :goto_21
    array-length v1, v10

    array-length v2, v0

    const/16 v8, 0x21

    if-ne v1, v2, :cond_36

    const/4 v1, 0x0

    aget-object v2, v0, v1

    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-eq v2, v8, :cond_37

    const/4 v0, 0x0

    goto :goto_24

    :cond_36
    const/4 v1, 0x0

    :cond_37
    aget-object v2, v0, v1

    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    array-length v1, v10

    array-length v0, v0

    if-ne v2, v8, :cond_38

    goto :goto_22

    :cond_38
    add-int/lit8 v0, v0, 0x1

    :goto_22
    sub-int/2addr v1, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\\."

    invoke-virtual {v14, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    :goto_23
    array-length v8, v2

    if-ge v1, v8, :cond_39

    aget-object v8, v2, v1

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v8, 0x2e

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_23

    :cond_39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_24
    if-nez v0, :cond_3c

    :goto_25
    const/4 v2, 0x0

    goto :goto_29

    .line 28
    :cond_3a
    :try_start_9
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unable to load publicsuffixes.gz resource from the classpath."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_1
    move-exception v0

    monitor-exit v9
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    throw v0

    :cond_3b
    move-object/from16 v26, v1

    :cond_3c
    move-object/from16 v1, v28

    if-eqz v1, :cond_3e

    const-string v0, "/"

    .line 29
    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3d

    goto :goto_26

    :cond_3d
    move-object/from16 v21, v1

    const/4 v2, 0x0

    goto :goto_28

    :cond_3e
    :goto_26
    invoke-virtual/range {p1 .. p1}, Lv4/q;->f()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_3f

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_27

    :cond_3f
    const-string v0, "/"

    :goto_27
    move-object/from16 v21, v0

    :goto_28
    new-instance v0, Lv4/i;

    move-object v1, v15

    move-object v15, v0

    move-object/from16 v16, v1

    move-object/from16 v17, v5

    move-object/from16 v20, v14

    invoke-direct/range {v15 .. v25}, Lv4/i;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V

    goto :goto_2a

    :goto_29
    const/4 v0, 0x0

    :goto_2a
    if-nez v0, :cond_40

    goto :goto_2b

    :cond_40
    if-nez v7, :cond_41

    .line 30
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object v7, v1

    :cond_41
    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_2b
    add-int/lit8 v4, v4, 0x1

    move v5, v2

    move-object/from16 v1, v26

    move-object/from16 v2, p0

    goto/16 :goto_2

    :cond_42
    if-eqz v7, :cond_43

    invoke-static {v7}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    goto :goto_2c

    :cond_43
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    .line 31
    :goto_2c
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_44

    return-void

    :cond_44
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public static e(ILjava/lang/String;Ljava/lang/String;)I
    .locals 2

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-ge p0, v0, :cond_1

    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return p0
.end method
