.class public final Ld/v;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld/v$a;
    }
.end annotation


# static fields
.field public static d:Ld/v;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/location/LocationManager;

.field public final c:Ld/v$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/location/LocationManager;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ld/v$a;

    invoke-direct {v0}, Ld/v$a;-><init>()V

    iput-object v0, p0, Ld/v;->c:Ld/v$a;

    iput-object p1, p0, Ld/v;->a:Landroid/content/Context;

    iput-object p2, p0, Ld/v;->b:Landroid/location/LocationManager;

    return-void
.end method
