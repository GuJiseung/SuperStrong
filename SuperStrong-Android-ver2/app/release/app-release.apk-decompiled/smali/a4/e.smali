.class public final synthetic La4/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, La4/e;->b:I

    iput-object p2, p0, La4/e;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 12

    .line 1
    iget p1, p0, La4/e;->b:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const-string v1, "strong"

    .line 5
    .line 6
    const-class v2, Lcom/superstrong/android/view/PaymentActivity2;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    const-string v4, "this$0"

    .line 10
    .line 11
    iget-object v5, p0, La4/e;->c:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch p1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    goto/16 :goto_2

    .line 17
    .line 18
    :pswitch_0
    check-cast v5, Lcom/superstrong/android/view/WalletActivity;

    .line 19
    .line 20
    sget p1, Lcom/superstrong/android/view/WalletActivity;->z:I

    .line 21
    .line 22
    invoke-static {v5, v4}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    new-instance p1, Landroid/content/Intent;

    .line 26
    .line 27
    const-class v0, Lcom/superstrong/android/view/PaymentActivity;

    .line 28
    .line 29
    invoke-direct {p1, v5, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v5, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_1
    check-cast v5, Lcom/superstrong/android/view/TimeCoinActivity;

    .line 37
    .line 38
    sget p1, Lcom/superstrong/android/view/TimeCoinActivity;->y:I

    .line 39
    .line 40
    invoke-static {v5, v4}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    new-instance p1, Landroid/content/Intent;

    .line 44
    .line 45
    const-class v0, Lcom/superstrong/android/view/WalletActivity;

    .line 46
    .line 47
    invoke-direct {p1, v5, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v5, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v5}, Landroid/app/Activity;->finish()V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_2
    check-cast v5, Lcom/superstrong/android/view/SwapActivity;

    .line 58
    .line 59
    sget p1, Lcom/superstrong/android/view/SwapActivity;->y:I

    .line 60
    .line 61
    invoke-static {v5, v4}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    new-instance p1, Landroid/content/Intent;

    .line 65
    .line 66
    const-class v0, Lcom/superstrong/android/view/SwapActivity2;

    .line 67
    .line 68
    invoke-direct {p1, v5, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v5, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v5}, Landroid/app/Activity;->finish()V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :pswitch_3
    check-cast v5, Lcom/superstrong/android/view/SignupActivity;

    .line 79
    .line 80
    sget p1, Lcom/superstrong/android/view/SignupActivity;->z:I

    .line 81
    .line 82
    invoke-static {v5, v4}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v5}, Lcom/superstrong/android/view/SignupActivity;->C()Lb4/r;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    iget-object p1, p1, Lb4/r;->d:Landroidx/lifecycle/s;

    .line 90
    .line 91
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->d()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-static {v0}, Ll4/f;->c(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    check-cast v0, Ljava/lang/Number;

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    add-int/lit8 v0, v0, -0x1

    .line 105
    .line 106
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {p1, v0}, Landroidx/lifecycle/s;->j(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :pswitch_4
    check-cast v5, La4/p;

    .line 115
    .line 116
    sget p1, La4/p;->X:I

    .line 117
    .line 118
    invoke-static {v5, v4}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v5}, La4/p;->P()Lb4/r;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    iget-object v0, v5, La4/p;->V:Lz3/t;

    .line 126
    .line 127
    invoke-static {v0}, Ll4/f;->c(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    iget-object v0, v0, Lz3/t;->c:Landroid/widget/EditText;

    .line 131
    .line 132
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    const-string v1, "code"

    .line 144
    .line 145
    invoke-static {v0, v1}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    new-instance v1, Ly3/a;

    .line 149
    .line 150
    invoke-direct {v1, v0}, Ly3/a;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    iget-object v0, p1, Lb4/r;->h:Landroidx/lifecycle/s;

    .line 154
    .line 155
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 156
    .line 157
    invoke-virtual {v0, v2}, Landroidx/lifecycle/s;->j(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    invoke-static {p1}, Landroidx/activity/k;->k(Landroidx/lifecycle/f0;)Ls4/w;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    new-instance v2, Lb4/p;

    .line 165
    .line 166
    invoke-direct {v2, p1, v1, v3}, Lb4/p;-><init>(Lb4/r;Ly3/a;Le4/d;)V

    .line 167
    .line 168
    .line 169
    invoke-static {v0, v2}, Lkotlinx/coroutines/internal/f;->b(Ls4/w;Lk4/p;)V

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :pswitch_5
    check-cast v5, La4/n;

    .line 174
    .line 175
    sget p1, La4/n;->X:I

    .line 176
    .line 177
    invoke-static {v5, v4}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    iget-object p1, v5, La4/n;->V:Lz3/s;

    .line 181
    .line 182
    invoke-static {p1}, Ll4/f;->c(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    iget-object p1, p1, Lz3/s;->e:Landroid/widget/CheckBox;

    .line 186
    .line 187
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 188
    .line 189
    .line 190
    move-result p1

    .line 191
    if-eqz p1, :cond_0

    .line 192
    .line 193
    iget-object p1, v5, La4/n;->V:Lz3/s;

    .line 194
    .line 195
    invoke-static {p1}, Ll4/f;->c(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    iget-object p1, p1, Lz3/s;->d:Landroid/widget/CheckBox;

    .line 199
    .line 200
    const/4 v0, 0x1

    .line 201
    invoke-virtual {p1, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 202
    .line 203
    .line 204
    iget-object p1, v5, La4/n;->V:Lz3/s;

    .line 205
    .line 206
    invoke-static {p1}, Ll4/f;->c(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    iget-object p1, p1, Lz3/s;->c:Landroid/widget/CheckBox;

    .line 210
    .line 211
    invoke-virtual {p1, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 212
    .line 213
    .line 214
    :cond_0
    return-void

    .line 215
    :pswitch_6
    check-cast v5, Lcom/superstrong/android/view/PaymentActivity3;

    .line 216
    .line 217
    sget p1, Lcom/superstrong/android/view/PaymentActivity3;->y:I

    .line 218
    .line 219
    invoke-static {v5, v4}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    new-instance p1, Landroid/content/Intent;

    .line 223
    .line 224
    invoke-direct {p1, v5, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v5, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v5}, Landroid/app/Activity;->finish()V

    .line 231
    .line 232
    .line 233
    return-void

    .line 234
    :pswitch_7
    check-cast v5, Lcom/superstrong/android/view/PaymentActivity;

    .line 235
    .line 236
    sget p1, Lcom/superstrong/android/view/PaymentActivity;->z:I

    .line 237
    .line 238
    invoke-static {v5, v4}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    new-instance p1, Landroid/content/Intent;

    .line 242
    .line 243
    invoke-direct {p1, v5, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v5, v1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    const-string v1, "jwt_token"

    .line 251
    .line 252
    const-string v2, ""

    .line 253
    .line 254
    invoke-interface {p1, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    new-instance v4, Lorg/json/JSONObject;

    .line 259
    .line 260
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 261
    .line 262
    .line 263
    const-string v6, "token"

    .line 264
    .line 265
    invoke-virtual {v4, v6, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    const-string v4, "ID"

    .line 273
    .line 274
    invoke-interface {p1, v4, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object p1

    .line 278
    if-nez v1, :cond_1

    .line 279
    .line 280
    const-string v1, "nonetoken"

    .line 281
    .line 282
    goto :goto_0

    .line 283
    :cond_1
    if-nez p1, :cond_2

    .line 284
    .line 285
    const-string p1, "noneid"

    .line 286
    .line 287
    :cond_2
    :goto_0
    move-object v11, p1

    .line 288
    const-string p1, ": "

    .line 289
    .line 290
    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    const-string v2, "\ud1a0\ud06c\u3161\u3161\u3161\u3161\u3161\u3161\u3161\u3161\u3161\u3161\u3161\u3161\u3161\u3161\u3161\u3161\u3161\u3161\u3161\u3161\u3161\u3161\u3161\u3161\u3161\u3161\u3161\u3161\u3161\u3161\u3134"

    .line 295
    .line 296
    invoke-static {v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 297
    .line 298
    .line 299
    iget-object p1, v5, Lcom/superstrong/android/view/PaymentActivity;->y:Lb4/o;

    .line 300
    .line 301
    const-string v2, "paymentVModel"

    .line 302
    .line 303
    if-eqz p1, :cond_7

    .line 304
    .line 305
    iget-object p1, p1, Lb4/o;->d:Landroidx/lifecycle/s;

    .line 306
    .line 307
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->d()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object p1

    .line 311
    move-object v7, p1

    .line 312
    check-cast v7, Ljava/lang/String;

    .line 313
    .line 314
    iget-object p1, v5, Lcom/superstrong/android/view/PaymentActivity;->y:Lb4/o;

    .line 315
    .line 316
    if-eqz p1, :cond_6

    .line 317
    .line 318
    iget-object p1, p1, Lb4/o;->e:Landroidx/lifecycle/s;

    .line 319
    .line 320
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->d()Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    check-cast p1, Ljava/lang/Double;

    .line 325
    .line 326
    iget-object v6, v5, Lcom/superstrong/android/view/PaymentActivity;->y:Lb4/o;

    .line 327
    .line 328
    if-eqz v6, :cond_5

    .line 329
    .line 330
    iget-object v6, v6, Lb4/o;->f:Landroidx/lifecycle/s;

    .line 331
    .line 332
    invoke-virtual {v6}, Landroidx/lifecycle/LiveData;->d()Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v6

    .line 336
    move-object v10, v6

    .line 337
    check-cast v10, Ljava/lang/String;

    .line 338
    .line 339
    if-eqz v7, :cond_4

    .line 340
    .line 341
    if-eqz p1, :cond_4

    .line 342
    .line 343
    if-eqz v10, :cond_4

    .line 344
    .line 345
    if-eqz v11, :cond_4

    .line 346
    .line 347
    iget-object v0, v5, Lcom/superstrong/android/view/PaymentActivity;->y:Lb4/o;

    .line 348
    .line 349
    if-eqz v0, :cond_3

    .line 350
    .line 351
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 352
    .line 353
    .line 354
    move-result-wide v8

    .line 355
    new-instance p1, Ly3/q;

    .line 356
    .line 357
    move-object v6, p1

    .line 358
    invoke-direct/range {v6 .. v11}, Ly3/q;-><init>(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    invoke-static {v5}, Lb4/b;->c(Landroidx/appcompat/app/c;)V

    .line 362
    .line 363
    .line 364
    new-instance v0, Ly3/m;

    .line 365
    .line 366
    new-instance v2, Lq3/j;

    .line 367
    .line 368
    invoke-direct {v2}, Lq3/j;-><init>()V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v2, p1}, Lq3/j;->f(Ljava/lang/Object;)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object p1

    .line 375
    const-string v2, "Gson().toJson(payInfo1)"

    .line 376
    .line 377
    invoke-static {p1, v2}, Ll4/f;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    invoke-static {p1}, Lb4/b;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object p1

    .line 384
    invoke-direct {v0, p1, v1}, Ly3/m;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    invoke-static {}, Ly3/z;->a()Ly3/b;

    .line 388
    .line 389
    .line 390
    move-result-object p1

    .line 391
    invoke-interface {p1, v0}, Ly3/b;->e(Ly3/m;)Lg5/b;

    .line 392
    .line 393
    .line 394
    move-result-object p1

    .line 395
    new-instance v0, Lb4/l;

    .line 396
    .line 397
    invoke-direct {v0, v5}, Lb4/l;-><init>(Lcom/superstrong/android/view/PaymentActivity;)V

    .line 398
    .line 399
    .line 400
    invoke-interface {p1, v0}, Lg5/b;->k(Lg5/d;)V

    .line 401
    .line 402
    .line 403
    goto :goto_1

    .line 404
    :cond_3
    invoke-static {v2}, Ll4/f;->k(Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    throw v3

    .line 408
    :cond_4
    new-instance v2, Ljava/lang/StringBuilder;

    .line 409
    .line 410
    const-string v3, "to address: "

    .line 411
    .line 412
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v2

    .line 422
    const-string v3, "To Address"

    .line 423
    .line 424
    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 425
    .line 426
    .line 427
    new-instance v2, Ljava/lang/StringBuilder;

    .line 428
    .line 429
    const-string v3, "send amount: "

    .line 430
    .line 431
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 435
    .line 436
    .line 437
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object p1

    .line 441
    const-string v2, "Send Amount"

    .line 442
    .line 443
    invoke-static {v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 444
    .line 445
    .line 446
    new-instance p1, Ljava/lang/StringBuilder;

    .line 447
    .line 448
    const-string v2, "coin name: "

    .line 449
    .line 450
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {p1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object p1

    .line 460
    const-string v2, "Coin name"

    .line 461
    .line 462
    invoke-static {v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 463
    .line 464
    .line 465
    const-string p1, "token: "

    .line 466
    .line 467
    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object p1

    .line 471
    const-string v1, "Token"

    .line 472
    .line 473
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 474
    .line 475
    .line 476
    new-instance p1, Ljava/lang/StringBuilder;

    .line 477
    .line 478
    const-string v1, "id: "

    .line 479
    .line 480
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 481
    .line 482
    .line 483
    invoke-virtual {p1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 484
    .line 485
    .line 486
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object p1

    .line 490
    invoke-static {v4, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 491
    .line 492
    .line 493
    const-string p1, "\uc785\ub825\ud55c \uc8fc\uc18c\uc640 \ucf54\uc778\uc758 \uc885\ub958, \uc218\ub7c9\uc744 \uc785\ub825\ud574\uc8fc\uc138\uc694."

    .line 494
    .line 495
    invoke-static {v5, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 496
    .line 497
    .line 498
    move-result-object p1

    .line 499
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 500
    .line 501
    .line 502
    :goto_1
    return-void

    .line 503
    :cond_5
    invoke-static {v2}, Ll4/f;->k(Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    throw v3

    .line 507
    :cond_6
    invoke-static {v2}, Ll4/f;->k(Ljava/lang/String;)V

    .line 508
    .line 509
    .line 510
    throw v3

    .line 511
    :cond_7
    invoke-static {v2}, Ll4/f;->k(Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    throw v3

    .line 515
    :pswitch_8
    check-cast v5, Lcom/superstrong/android/view/FindPassActivity;

    .line 516
    .line 517
    sget p1, Lcom/superstrong/android/view/FindPassActivity;->x:I

    .line 518
    .line 519
    invoke-static {v5, v4}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 520
    .line 521
    .line 522
    new-instance p1, Landroid/content/Intent;

    .line 523
    .line 524
    const-class v0, Lcom/superstrong/android/view/FindPassActivity2;

    .line 525
    .line 526
    invoke-direct {p1, v5, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 527
    .line 528
    .line 529
    invoke-virtual {v5, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 530
    .line 531
    .line 532
    return-void

    .line 533
    :pswitch_9
    check-cast v5, La4/f;

    .line 534
    .line 535
    sget p1, La4/f;->X:I

    .line 536
    .line 537
    invoke-static {v5, v4}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 538
    .line 539
    .line 540
    iget-object p1, v5, La4/f;->W:Landroidx/lifecycle/g0;

    .line 541
    .line 542
    invoke-virtual {p1}, Landroidx/lifecycle/g0;->a()Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object p1

    .line 546
    check-cast p1, Lb4/e;

    .line 547
    .line 548
    iget-object v0, v5, La4/f;->V:Lz3/q;

    .line 549
    .line 550
    invoke-static {v0}, Ll4/f;->c(Ljava/lang/Object;)V

    .line 551
    .line 552
    .line 553
    iget-object v0, v0, Lz3/q;->a:Landroidx/appcompat/widget/AppCompatEditText;

    .line 554
    .line 555
    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    iget-object v1, v5, La4/f;->V:Lz3/q;

    .line 564
    .line 565
    invoke-static {v1}, Ll4/f;->c(Ljava/lang/Object;)V

    .line 566
    .line 567
    .line 568
    iget-object v1, v1, Lz3/q;->b:Landroidx/appcompat/widget/AppCompatEditText;

    .line 569
    .line 570
    invoke-virtual {v1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 571
    .line 572
    .line 573
    move-result-object v1

    .line 574
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object v1

    .line 578
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 579
    .line 580
    .line 581
    iget-object v2, p1, Lb4/e;->g:Landroidx/lifecycle/s;

    .line 582
    .line 583
    invoke-static {v0, v1}, Ll4/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 584
    .line 585
    .line 586
    move-result v4

    .line 587
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 588
    .line 589
    .line 590
    move-result-object v4

    .line 591
    invoke-virtual {v2, v4}, Landroidx/lifecycle/s;->j(Ljava/lang/Object;)V

    .line 592
    .line 593
    .line 594
    invoke-static {v0, v1}, Ll4/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 595
    .line 596
    .line 597
    move-result v1

    .line 598
    if-eqz v1, :cond_8

    .line 599
    .line 600
    invoke-static {p1}, Landroidx/activity/k;->k(Landroidx/lifecycle/f0;)Ls4/w;

    .line 601
    .line 602
    .line 603
    move-result-object v1

    .line 604
    new-instance v2, Lb4/d;

    .line 605
    .line 606
    invoke-direct {v2, p1, v0, v3}, Lb4/d;-><init>(Lb4/e;Ljava/lang/String;Le4/d;)V

    .line 607
    .line 608
    .line 609
    invoke-static {v1, v2}, Lkotlinx/coroutines/internal/f;->b(Ls4/w;Lk4/p;)V

    .line 610
    .line 611
    .line 612
    :cond_8
    return-void

    .line 613
    :goto_2
    check-cast v5, Lcom/superstrong/android/view/lallaaaalllaa;

    .line 614
    .line 615
    sget p1, Lcom/superstrong/android/view/lallaaaalllaa;->z:I

    .line 616
    .line 617
    invoke-static {v5, v4}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 618
    .line 619
    .line 620
    iget-object p1, v5, Lcom/superstrong/android/view/lallaaaalllaa;->x:Lb4/j;

    .line 621
    .line 622
    const-string v2, "loginViewModel"

    .line 623
    .line 624
    if-eqz p1, :cond_c

    .line 625
    .line 626
    iget-object p1, p1, Lb4/j;->d:Landroidx/lifecycle/s;

    .line 627
    .line 628
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->d()Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object p1

    .line 632
    check-cast p1, Ljava/lang/String;

    .line 633
    .line 634
    iget-object v4, v5, Lcom/superstrong/android/view/lallaaaalllaa;->x:Lb4/j;

    .line 635
    .line 636
    if-eqz v4, :cond_b

    .line 637
    .line 638
    iget-object v4, v4, Lb4/j;->e:Landroidx/lifecycle/s;

    .line 639
    .line 640
    invoke-virtual {v4}, Landroidx/lifecycle/LiveData;->d()Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    move-result-object v4

    .line 644
    check-cast v4, Ljava/lang/String;

    .line 645
    .line 646
    if-eqz p1, :cond_a

    .line 647
    .line 648
    if-eqz v4, :cond_a

    .line 649
    .line 650
    iget-object v6, v5, Lcom/superstrong/android/view/lallaaaalllaa;->x:Lb4/j;

    .line 651
    .line 652
    if-eqz v6, :cond_9

    .line 653
    .line 654
    invoke-virtual {v5, v1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 655
    .line 656
    .line 657
    move-result-object v0

    .line 658
    new-instance v1, Ly3/d0;

    .line 659
    .line 660
    invoke-direct {v1, p1, v4}, Ly3/d0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 661
    .line 662
    .line 663
    new-instance v2, Ly3/l;

    .line 664
    .line 665
    sget-object v3, Lb4/a;->a:[B

    .line 666
    .line 667
    new-instance v3, Lq3/j;

    .line 668
    .line 669
    invoke-direct {v3}, Lq3/j;-><init>()V

    .line 670
    .line 671
    .line 672
    invoke-virtual {v3, v1}, Lq3/j;->f(Ljava/lang/Object;)Ljava/lang/String;

    .line 673
    .line 674
    .line 675
    move-result-object v1

    .line 676
    const-string v3, "Gson().toJson(user)"

    .line 677
    .line 678
    invoke-static {v1, v3}, Ll4/f;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 679
    .line 680
    .line 681
    invoke-static {v1}, Lb4/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 682
    .line 683
    .line 684
    move-result-object v1

    .line 685
    invoke-direct {v2, v1}, Ly3/l;-><init>(Ljava/lang/String;)V

    .line 686
    .line 687
    .line 688
    invoke-static {}, Ly3/z;->a()Ly3/b;

    .line 689
    .line 690
    .line 691
    move-result-object v1

    .line 692
    invoke-interface {v1, v2}, Ly3/b;->d(Ly3/l;)Lg5/b;

    .line 693
    .line 694
    .line 695
    move-result-object v1

    .line 696
    new-instance v2, Lb4/i;

    .line 697
    .line 698
    invoke-direct {v2, v5, v0, p1}, Lb4/i;-><init>(Lcom/superstrong/android/view/lallaaaalllaa;Landroid/content/SharedPreferences;Ljava/lang/String;)V

    .line 699
    .line 700
    .line 701
    invoke-interface {v1, v2}, Lg5/b;->k(Lg5/d;)V

    .line 702
    .line 703
    .line 704
    goto :goto_3

    .line 705
    :cond_9
    invoke-static {v2}, Ll4/f;->k(Ljava/lang/String;)V

    .line 706
    .line 707
    .line 708
    throw v3

    .line 709
    :cond_a
    const-string p1, "id\uc640 password\ub97c \uc785\ub825\ud574 \uc8fc\uc138\uc694"

    .line 710
    .line 711
    invoke-static {v5, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 712
    .line 713
    .line 714
    move-result-object p1

    .line 715
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 716
    .line 717
    .line 718
    :goto_3
    return-void

    .line 719
    :cond_b
    invoke-static {v2}, Ll4/f;->k(Ljava/lang/String;)V

    .line 720
    .line 721
    .line 722
    throw v3

    .line 723
    :cond_c
    invoke-static {v2}, Ll4/f;->k(Ljava/lang/String;)V

    .line 724
    .line 725
    .line 726
    throw v3

    .line 727
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
.end method
