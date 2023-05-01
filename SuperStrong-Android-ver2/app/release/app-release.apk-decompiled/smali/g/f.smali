.class public final Lg/f;
.super Landroid/view/MenuInflater;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg/f$b;,
        Lg/f$a;
    }
.end annotation


# static fields
.field public static final e:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static final f:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# instance fields
.field public final a:[Ljava/lang/Object;

.field public final b:[Ljava/lang/Object;

.field public final c:Landroid/content/Context;

.field public d:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Class;

    const/4 v1, 0x0

    const-class v2, Landroid/content/Context;

    aput-object v2, v0, v1

    sput-object v0, Lg/f;->e:[Ljava/lang/Class;

    sput-object v0, Lg/f;->f:[Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0, p1}, Landroid/view/MenuInflater;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lg/f;->c:Landroid/content/Context;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    iput-object v0, p0, Lg/f;->a:[Ljava/lang/Object;

    iput-object v0, p0, Lg/f;->b:[Ljava/lang/Object;

    return-void
.end method

.method public static a(Landroid/content/Context;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    instance-of v0, p0, Landroid/content/ContextWrapper;

    if-eqz v0, :cond_1

    check-cast p0, Landroid/content/ContextWrapper;

    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Lg/f;->a(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object p0

    :cond_1
    return-object p0
.end method


# virtual methods
.method public final b(Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    new-instance v2, Lg/f$b;

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    invoke-direct {v2, v0, v3}, Lg/f$b;-><init>(Lg/f;Landroid/view/Menu;)V

    .line 10
    .line 11
    .line 12
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    :goto_0
    const/4 v4, 0x1

    .line 17
    const/4 v5, 0x2

    .line 18
    const-string v6, "menu"

    .line 19
    .line 20
    if-ne v3, v5, :cond_1

    .line 21
    .line 22
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    if-eqz v7, :cond_0

    .line 31
    .line 32
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    new-instance v1, Ljava/lang/RuntimeException;

    .line 38
    .line 39
    const-string v2, "Expecting menu, got "

    .line 40
    .line 41
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v1

    .line 49
    :cond_1
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-ne v3, v4, :cond_17

    .line 54
    .line 55
    :goto_1
    const/4 v7, 0x0

    .line 56
    move v9, v7

    .line 57
    move v10, v9

    .line 58
    const/4 v11, 0x0

    .line 59
    :goto_2
    if-nez v9, :cond_16

    .line 60
    .line 61
    if-eq v3, v4, :cond_15

    .line 62
    .line 63
    iget-object v12, v2, Lg/f$b;->a:Landroid/view/Menu;

    .line 64
    .line 65
    const-string v13, "item"

    .line 66
    .line 67
    const-string v14, "group"

    .line 68
    .line 69
    const/4 v15, 0x3

    .line 70
    if-eq v3, v5, :cond_7

    .line 71
    .line 72
    if-eq v3, v15, :cond_2

    .line 73
    .line 74
    goto/16 :goto_3

    .line 75
    .line 76
    :cond_2
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    if-eqz v10, :cond_3

    .line 81
    .line 82
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v15

    .line 86
    if-eqz v15, :cond_3

    .line 87
    .line 88
    move-object/from16 v8, p1

    .line 89
    .line 90
    move v10, v7

    .line 91
    const/4 v5, 0x0

    .line 92
    const/4 v11, 0x0

    .line 93
    goto/16 :goto_b

    .line 94
    .line 95
    :cond_3
    invoke-virtual {v3, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v14

    .line 99
    if-eqz v14, :cond_4

    .line 100
    .line 101
    iput v7, v2, Lg/f$b;->b:I

    .line 102
    .line 103
    iput v7, v2, Lg/f$b;->c:I

    .line 104
    .line 105
    iput v7, v2, Lg/f$b;->d:I

    .line 106
    .line 107
    iput v7, v2, Lg/f$b;->e:I

    .line 108
    .line 109
    iput-boolean v4, v2, Lg/f$b;->f:Z

    .line 110
    .line 111
    iput-boolean v4, v2, Lg/f$b;->g:Z

    .line 112
    .line 113
    goto/16 :goto_3

    .line 114
    .line 115
    :cond_4
    invoke-virtual {v3, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v13

    .line 119
    if-eqz v13, :cond_6

    .line 120
    .line 121
    iget-boolean v3, v2, Lg/f$b;->h:Z

    .line 122
    .line 123
    if-nez v3, :cond_9

    .line 124
    .line 125
    iget-object v3, v2, Lg/f$b;->z:Lf0/b;

    .line 126
    .line 127
    if-eqz v3, :cond_5

    .line 128
    .line 129
    invoke-virtual {v3}, Lf0/b;->a()Z

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    if-eqz v3, :cond_5

    .line 134
    .line 135
    iput-boolean v4, v2, Lg/f$b;->h:Z

    .line 136
    .line 137
    iget v3, v2, Lg/f$b;->b:I

    .line 138
    .line 139
    iget v13, v2, Lg/f$b;->i:I

    .line 140
    .line 141
    iget v14, v2, Lg/f$b;->j:I

    .line 142
    .line 143
    iget-object v15, v2, Lg/f$b;->k:Ljava/lang/CharSequence;

    .line 144
    .line 145
    invoke-interface {v12, v3, v13, v14, v15}, Landroid/view/Menu;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    invoke-interface {v3}, Landroid/view/SubMenu;->getItem()Landroid/view/MenuItem;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    invoke-virtual {v2, v3}, Lg/f$b;->b(Landroid/view/MenuItem;)V

    .line 154
    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_5
    iput-boolean v4, v2, Lg/f$b;->h:Z

    .line 158
    .line 159
    iget v3, v2, Lg/f$b;->b:I

    .line 160
    .line 161
    iget v13, v2, Lg/f$b;->i:I

    .line 162
    .line 163
    iget v14, v2, Lg/f$b;->j:I

    .line 164
    .line 165
    iget-object v15, v2, Lg/f$b;->k:Ljava/lang/CharSequence;

    .line 166
    .line 167
    invoke-interface {v12, v3, v13, v14, v15}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    invoke-virtual {v2, v3}, Lg/f$b;->b(Landroid/view/MenuItem;)V

    .line 172
    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_6
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    if-eqz v3, :cond_9

    .line 180
    .line 181
    move v9, v4

    .line 182
    goto :goto_3

    .line 183
    :cond_7
    if-eqz v10, :cond_8

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_8
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    invoke-virtual {v3, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v14

    .line 194
    const/4 v5, 0x4

    .line 195
    iget-object v8, v2, Lg/f$b;->E:Lg/f;

    .line 196
    .line 197
    if-eqz v14, :cond_a

    .line 198
    .line 199
    iget-object v3, v8, Lg/f;->c:Landroid/content/Context;

    .line 200
    .line 201
    sget-object v8, Lc/b;->q:[I

    .line 202
    .line 203
    invoke-virtual {v3, v1, v8}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    invoke-virtual {v3, v4, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 208
    .line 209
    .line 210
    move-result v8

    .line 211
    iput v8, v2, Lg/f$b;->b:I

    .line 212
    .line 213
    invoke-virtual {v3, v15, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 214
    .line 215
    .line 216
    move-result v8

    .line 217
    iput v8, v2, Lg/f$b;->c:I

    .line 218
    .line 219
    invoke-virtual {v3, v5, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 220
    .line 221
    .line 222
    move-result v5

    .line 223
    iput v5, v2, Lg/f$b;->d:I

    .line 224
    .line 225
    const/4 v5, 0x5

    .line 226
    invoke-virtual {v3, v5, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 227
    .line 228
    .line 229
    move-result v5

    .line 230
    iput v5, v2, Lg/f$b;->e:I

    .line 231
    .line 232
    const/4 v5, 0x2

    .line 233
    invoke-virtual {v3, v5, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 234
    .line 235
    .line 236
    move-result v8

    .line 237
    iput-boolean v8, v2, Lg/f$b;->f:Z

    .line 238
    .line 239
    invoke-virtual {v3, v7, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 240
    .line 241
    .line 242
    move-result v5

    .line 243
    iput-boolean v5, v2, Lg/f$b;->g:Z

    .line 244
    .line 245
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 246
    .line 247
    .line 248
    :cond_9
    :goto_3
    move-object/from16 v8, p1

    .line 249
    .line 250
    const/4 v5, 0x0

    .line 251
    goto/16 :goto_b

    .line 252
    .line 253
    :cond_a
    invoke-virtual {v3, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v13

    .line 257
    if-eqz v13, :cond_13

    .line 258
    .line 259
    iget-object v3, v8, Lg/f;->c:Landroid/content/Context;

    .line 260
    .line 261
    sget-object v12, Lc/b;->r:[I

    .line 262
    .line 263
    new-instance v13, Landroidx/appcompat/widget/j1;

    .line 264
    .line 265
    invoke-virtual {v3, v1, v12}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 266
    .line 267
    .line 268
    move-result-object v12

    .line 269
    invoke-direct {v13, v3, v12}, Landroidx/appcompat/widget/j1;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 270
    .line 271
    .line 272
    const/4 v14, 0x2

    .line 273
    invoke-virtual {v13, v14, v7}, Landroidx/appcompat/widget/j1;->i(II)I

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    iput v3, v2, Lg/f$b;->i:I

    .line 278
    .line 279
    iget v3, v2, Lg/f$b;->c:I

    .line 280
    .line 281
    const/4 v12, 0x5

    .line 282
    invoke-virtual {v13, v12, v3}, Landroidx/appcompat/widget/j1;->h(II)I

    .line 283
    .line 284
    .line 285
    move-result v3

    .line 286
    const/4 v12, 0x6

    .line 287
    iget v14, v2, Lg/f$b;->d:I

    .line 288
    .line 289
    invoke-virtual {v13, v12, v14}, Landroidx/appcompat/widget/j1;->h(II)I

    .line 290
    .line 291
    .line 292
    move-result v12

    .line 293
    const/high16 v14, -0x10000

    .line 294
    .line 295
    and-int/2addr v3, v14

    .line 296
    const v14, 0xffff

    .line 297
    .line 298
    .line 299
    and-int/2addr v12, v14

    .line 300
    or-int/2addr v3, v12

    .line 301
    iput v3, v2, Lg/f$b;->j:I

    .line 302
    .line 303
    const/4 v3, 0x7

    .line 304
    invoke-virtual {v13, v3}, Landroidx/appcompat/widget/j1;->k(I)Ljava/lang/CharSequence;

    .line 305
    .line 306
    .line 307
    move-result-object v3

    .line 308
    iput-object v3, v2, Lg/f$b;->k:Ljava/lang/CharSequence;

    .line 309
    .line 310
    const/16 v3, 0x8

    .line 311
    .line 312
    invoke-virtual {v13, v3}, Landroidx/appcompat/widget/j1;->k(I)Ljava/lang/CharSequence;

    .line 313
    .line 314
    .line 315
    move-result-object v3

    .line 316
    iput-object v3, v2, Lg/f$b;->l:Ljava/lang/CharSequence;

    .line 317
    .line 318
    invoke-virtual {v13, v7, v7}, Landroidx/appcompat/widget/j1;->i(II)I

    .line 319
    .line 320
    .line 321
    move-result v3

    .line 322
    iput v3, v2, Lg/f$b;->m:I

    .line 323
    .line 324
    const/16 v3, 0x9

    .line 325
    .line 326
    invoke-virtual {v13, v3}, Landroidx/appcompat/widget/j1;->j(I)Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v3

    .line 330
    if-nez v3, :cond_b

    .line 331
    .line 332
    move v3, v7

    .line 333
    goto :goto_4

    .line 334
    :cond_b
    invoke-virtual {v3, v7}, Ljava/lang/String;->charAt(I)C

    .line 335
    .line 336
    .line 337
    move-result v3

    .line 338
    :goto_4
    iput-char v3, v2, Lg/f$b;->n:C

    .line 339
    .line 340
    const/16 v3, 0x10

    .line 341
    .line 342
    const/16 v12, 0x1000

    .line 343
    .line 344
    invoke-virtual {v13, v3, v12}, Landroidx/appcompat/widget/j1;->h(II)I

    .line 345
    .line 346
    .line 347
    move-result v3

    .line 348
    iput v3, v2, Lg/f$b;->o:I

    .line 349
    .line 350
    const/16 v3, 0xa

    .line 351
    .line 352
    invoke-virtual {v13, v3}, Landroidx/appcompat/widget/j1;->j(I)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v3

    .line 356
    if-nez v3, :cond_c

    .line 357
    .line 358
    move v3, v7

    .line 359
    goto :goto_5

    .line 360
    :cond_c
    invoke-virtual {v3, v7}, Ljava/lang/String;->charAt(I)C

    .line 361
    .line 362
    .line 363
    move-result v3

    .line 364
    :goto_5
    iput-char v3, v2, Lg/f$b;->p:C

    .line 365
    .line 366
    const/16 v3, 0x14

    .line 367
    .line 368
    invoke-virtual {v13, v3, v12}, Landroidx/appcompat/widget/j1;->h(II)I

    .line 369
    .line 370
    .line 371
    move-result v3

    .line 372
    iput v3, v2, Lg/f$b;->q:I

    .line 373
    .line 374
    const/16 v3, 0xb

    .line 375
    .line 376
    invoke-virtual {v13, v3}, Landroidx/appcompat/widget/j1;->l(I)Z

    .line 377
    .line 378
    .line 379
    move-result v12

    .line 380
    if-eqz v12, :cond_d

    .line 381
    .line 382
    invoke-virtual {v13, v3, v7}, Landroidx/appcompat/widget/j1;->a(IZ)Z

    .line 383
    .line 384
    .line 385
    move-result v3

    .line 386
    goto :goto_6

    .line 387
    :cond_d
    iget v3, v2, Lg/f$b;->e:I

    .line 388
    .line 389
    :goto_6
    iput v3, v2, Lg/f$b;->r:I

    .line 390
    .line 391
    invoke-virtual {v13, v15, v7}, Landroidx/appcompat/widget/j1;->a(IZ)Z

    .line 392
    .line 393
    .line 394
    move-result v3

    .line 395
    iput-boolean v3, v2, Lg/f$b;->s:Z

    .line 396
    .line 397
    iget-boolean v3, v2, Lg/f$b;->f:Z

    .line 398
    .line 399
    invoke-virtual {v13, v5, v3}, Landroidx/appcompat/widget/j1;->a(IZ)Z

    .line 400
    .line 401
    .line 402
    move-result v3

    .line 403
    iput-boolean v3, v2, Lg/f$b;->t:Z

    .line 404
    .line 405
    iget-boolean v3, v2, Lg/f$b;->g:Z

    .line 406
    .line 407
    invoke-virtual {v13, v4, v3}, Landroidx/appcompat/widget/j1;->a(IZ)Z

    .line 408
    .line 409
    .line 410
    move-result v3

    .line 411
    iput-boolean v3, v2, Lg/f$b;->u:Z

    .line 412
    .line 413
    const/16 v3, 0x15

    .line 414
    .line 415
    const/4 v5, -0x1

    .line 416
    invoke-virtual {v13, v3, v5}, Landroidx/appcompat/widget/j1;->h(II)I

    .line 417
    .line 418
    .line 419
    move-result v3

    .line 420
    iput v3, v2, Lg/f$b;->v:I

    .line 421
    .line 422
    const/16 v3, 0xc

    .line 423
    .line 424
    invoke-virtual {v13, v3}, Landroidx/appcompat/widget/j1;->j(I)Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v3

    .line 428
    iput-object v3, v2, Lg/f$b;->y:Ljava/lang/String;

    .line 429
    .line 430
    const/16 v3, 0xd

    .line 431
    .line 432
    invoke-virtual {v13, v3, v7}, Landroidx/appcompat/widget/j1;->i(II)I

    .line 433
    .line 434
    .line 435
    move-result v3

    .line 436
    iput v3, v2, Lg/f$b;->w:I

    .line 437
    .line 438
    const/16 v3, 0xf

    .line 439
    .line 440
    invoke-virtual {v13, v3}, Landroidx/appcompat/widget/j1;->j(I)Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v3

    .line 444
    iput-object v3, v2, Lg/f$b;->x:Ljava/lang/String;

    .line 445
    .line 446
    const/16 v3, 0xe

    .line 447
    .line 448
    invoke-virtual {v13, v3}, Landroidx/appcompat/widget/j1;->j(I)Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v3

    .line 452
    if-eqz v3, :cond_e

    .line 453
    .line 454
    move v12, v4

    .line 455
    goto :goto_7

    .line 456
    :cond_e
    move v12, v7

    .line 457
    :goto_7
    if-eqz v12, :cond_f

    .line 458
    .line 459
    iget v14, v2, Lg/f$b;->w:I

    .line 460
    .line 461
    if-nez v14, :cond_f

    .line 462
    .line 463
    iget-object v14, v2, Lg/f$b;->x:Ljava/lang/String;

    .line 464
    .line 465
    if-nez v14, :cond_f

    .line 466
    .line 467
    sget-object v12, Lg/f;->f:[Ljava/lang/Class;

    .line 468
    .line 469
    iget-object v8, v8, Lg/f;->b:[Ljava/lang/Object;

    .line 470
    .line 471
    invoke-virtual {v2, v3, v12, v8}, Lg/f$b;->a(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v3

    .line 475
    check-cast v3, Lf0/b;

    .line 476
    .line 477
    goto :goto_8

    .line 478
    :cond_f
    if-eqz v12, :cond_10

    .line 479
    .line 480
    const-string v3, "SupportMenuInflater"

    .line 481
    .line 482
    const-string v8, "Ignoring attribute \'actionProviderClass\'. Action view already specified."

    .line 483
    .line 484
    invoke-static {v3, v8}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 485
    .line 486
    .line 487
    :cond_10
    const/4 v3, 0x0

    .line 488
    :goto_8
    iput-object v3, v2, Lg/f$b;->z:Lf0/b;

    .line 489
    .line 490
    const/16 v3, 0x11

    .line 491
    .line 492
    invoke-virtual {v13, v3}, Landroidx/appcompat/widget/j1;->k(I)Ljava/lang/CharSequence;

    .line 493
    .line 494
    .line 495
    move-result-object v3

    .line 496
    iput-object v3, v2, Lg/f$b;->A:Ljava/lang/CharSequence;

    .line 497
    .line 498
    const/16 v3, 0x16

    .line 499
    .line 500
    invoke-virtual {v13, v3}, Landroidx/appcompat/widget/j1;->k(I)Ljava/lang/CharSequence;

    .line 501
    .line 502
    .line 503
    move-result-object v3

    .line 504
    iput-object v3, v2, Lg/f$b;->B:Ljava/lang/CharSequence;

    .line 505
    .line 506
    const/16 v3, 0x13

    .line 507
    .line 508
    invoke-virtual {v13, v3}, Landroidx/appcompat/widget/j1;->l(I)Z

    .line 509
    .line 510
    .line 511
    move-result v8

    .line 512
    if-eqz v8, :cond_11

    .line 513
    .line 514
    invoke-virtual {v13, v3, v5}, Landroidx/appcompat/widget/j1;->h(II)I

    .line 515
    .line 516
    .line 517
    move-result v3

    .line 518
    iget-object v5, v2, Lg/f$b;->D:Landroid/graphics/PorterDuff$Mode;

    .line 519
    .line 520
    invoke-static {v3, v5}, Landroidx/appcompat/widget/p0;->b(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 521
    .line 522
    .line 523
    move-result-object v3

    .line 524
    iput-object v3, v2, Lg/f$b;->D:Landroid/graphics/PorterDuff$Mode;

    .line 525
    .line 526
    const/4 v5, 0x0

    .line 527
    goto :goto_9

    .line 528
    :cond_11
    const/4 v5, 0x0

    .line 529
    iput-object v5, v2, Lg/f$b;->D:Landroid/graphics/PorterDuff$Mode;

    .line 530
    .line 531
    :goto_9
    const/16 v3, 0x12

    .line 532
    .line 533
    invoke-virtual {v13, v3}, Landroidx/appcompat/widget/j1;->l(I)Z

    .line 534
    .line 535
    .line 536
    move-result v8

    .line 537
    if-eqz v8, :cond_12

    .line 538
    .line 539
    invoke-virtual {v13, v3}, Landroidx/appcompat/widget/j1;->b(I)Landroid/content/res/ColorStateList;

    .line 540
    .line 541
    .line 542
    move-result-object v3

    .line 543
    iput-object v3, v2, Lg/f$b;->C:Landroid/content/res/ColorStateList;

    .line 544
    .line 545
    goto :goto_a

    .line 546
    :cond_12
    iput-object v5, v2, Lg/f$b;->C:Landroid/content/res/ColorStateList;

    .line 547
    .line 548
    :goto_a
    invoke-virtual {v13}, Landroidx/appcompat/widget/j1;->n()V

    .line 549
    .line 550
    .line 551
    iput-boolean v7, v2, Lg/f$b;->h:Z

    .line 552
    .line 553
    move-object/from16 v8, p1

    .line 554
    .line 555
    goto :goto_b

    .line 556
    :cond_13
    const/4 v5, 0x0

    .line 557
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 558
    .line 559
    .line 560
    move-result v8

    .line 561
    if-eqz v8, :cond_14

    .line 562
    .line 563
    iput-boolean v4, v2, Lg/f$b;->h:Z

    .line 564
    .line 565
    iget v3, v2, Lg/f$b;->b:I

    .line 566
    .line 567
    iget v8, v2, Lg/f$b;->i:I

    .line 568
    .line 569
    iget v13, v2, Lg/f$b;->j:I

    .line 570
    .line 571
    iget-object v14, v2, Lg/f$b;->k:Ljava/lang/CharSequence;

    .line 572
    .line 573
    invoke-interface {v12, v3, v8, v13, v14}, Landroid/view/Menu;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;

    .line 574
    .line 575
    .line 576
    move-result-object v3

    .line 577
    invoke-interface {v3}, Landroid/view/SubMenu;->getItem()Landroid/view/MenuItem;

    .line 578
    .line 579
    .line 580
    move-result-object v8

    .line 581
    invoke-virtual {v2, v8}, Lg/f$b;->b(Landroid/view/MenuItem;)V

    .line 582
    .line 583
    .line 584
    move-object/from16 v8, p1

    .line 585
    .line 586
    invoke-virtual {v0, v8, v1, v3}, Lg/f;->b(Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V

    .line 587
    .line 588
    .line 589
    goto :goto_b

    .line 590
    :cond_14
    move-object/from16 v8, p1

    .line 591
    .line 592
    move-object v11, v3

    .line 593
    move v10, v4

    .line 594
    :goto_b
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 595
    .line 596
    .line 597
    move-result v3

    .line 598
    const/4 v5, 0x2

    .line 599
    goto/16 :goto_2

    .line 600
    .line 601
    :cond_15
    new-instance v1, Ljava/lang/RuntimeException;

    .line 602
    .line 603
    const-string v2, "Unexpected end of document"

    .line 604
    .line 605
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 606
    .line 607
    .line 608
    throw v1

    .line 609
    :cond_16
    return-void

    .line 610
    :cond_17
    move-object/from16 v8, p1

    .line 611
    .line 612
    goto/16 :goto_0
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
.end method

.method public final inflate(ILandroid/view/Menu;)V
    .locals 3

    const-string v0, "Error inflating menu XML"

    instance-of v1, p2, La0/a;

    if-nez v1, :cond_0

    invoke-super {p0, p1, p2}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    return-void

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lg/f;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroid/content/res/Resources;->getLayout(I)Landroid/content/res/XmlResourceParser;

    move-result-object v1

    invoke-static {v1}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object p1

    invoke-virtual {p0, v1, p1, p2}, Lg/f;->b(Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1}, Landroid/content/res/XmlResourceParser;->close()V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    new-instance p2, Landroid/view/InflateException;

    invoke-direct {p2, v0, p1}, Landroid/view/InflateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    new-instance p2, Landroid/view/InflateException;

    invoke-direct {p2, v0, p1}, Landroid/view/InflateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    if-eqz v1, :cond_1

    invoke-interface {v1}, Landroid/content/res/XmlResourceParser;->close()V

    :cond_1
    throw p1
.end method
